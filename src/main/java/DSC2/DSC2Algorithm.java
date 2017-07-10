package DSC2;

import Output.Response;
import com.datumbox.framework.common.dataobjects.FlatDataCollection;
import com.datumbox.framework.common.dataobjects.TransposeDataCollection;
import com.datumbox.framework.core.statistics.parametrics.independentsamples.LevenesIndependentSamples;
import jsc.datastructures.MatchedData;
import jsc.relatedsamples.FriedmanTest;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.stat.inference.KolmogorovSmirnovTest;
import org.apache.commons.math3.stat.inference.OneWayAnova;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class DSC2Algorithm
{
    public double calculatePValue(Response input)
    {
        DataHolder dh = new DataHolder(input);

        RealMatrix m = MatrixUtils.createRealMatrix(input.getProblems().size(), input.getNumberOfAlgorithms());
        for(int i = 0; i<input.getProblems().size(); i++)
        {
            for(int j = 0; j<input.getNumberOfAlgorithms(); j++)
            {
                m.setEntry(i, j, input.getProblems().get(i).getResult().get(j).getRank());
            }
        }


        boolean normalityTest = true;
        for (int i = 0; i < input.getNumberOfAlgorithms(); i++)
        {
            Double[] testArray = dh.getAlgorithmsData(i);
            double avg = Arrays.stream(testArray).mapToDouble(d->d).average().getAsDouble();
            DoubleSummaryStatistics s = Arrays.stream(testArray).mapToDouble(d->d).summaryStatistics();
            NormalDistribution nd = new NormalDistribution(avg,5 /*TODO correct parameters*/);
            double[] testArrayDouble = Arrays.stream(testArray).mapToDouble(d->d).toArray();
            //TODO move bool flag here
            if (new KolmogorovSmirnovTest().kolmogorovSmirnovStatistic(nd, testArrayDouble) < input.getMethod().getAlpha())
                normalityTest = false;
        }



        TransposeDataCollection transposeDataCollection = new TransposeDataCollection();
        List<double[]> anovaList = new ArrayList<>();
        for (int i = 0; i < input.getNumberOfAlgorithms(); i++)
        {
            Double[] testArray = dh.getAlgorithmsData(i);
            anovaList.add(Arrays.stream(testArray).mapToDouble(d->d).toArray());
            transposeDataCollection.put(i, new FlatDataCollection(Arrays.asList((Object[])testArray)));
        }

        boolean levensTest = LevenesIndependentSamples.testVariances(transposeDataCollection, input.getMethod().getAlpha());

        if(levensTest && normalityTest)
        {
            return new OneWayAnova().anovaPValue(anovaList);
        }
        else
        {
            //TODO more tests
            FriedmanTest t =  new FriedmanTest(new MatchedData(m.getData()));
            return t.getSP();
        }
    }

}