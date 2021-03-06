package Output;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Response
{
    @SerializedName("ranked_matrix")
    private List<ProblemSolutions> problems;
    @SerializedName("number_algorithms")
    private int numberOfAlgorithms;
    @SerializedName("parametric_tests")
    private int parametricTest;
    private Method method;

    public Response(int numberOfAlgorithms, Method method)
    {
        this.problems = new ArrayList<>();
        this.numberOfAlgorithms = numberOfAlgorithms;
        this.method = method;
    }

    public void addProblem(ProblemSolutions problem)
    {
        this.problems.add(problem);
    }

    public List<ProblemSolutions> getProblems()
    {
        return this.problems;
    }

    public int getNumberOfAlgorithms()
    {
        return numberOfAlgorithms;
    }

    public Method getMethod()
    {
        return this.method;
    }

    public void setParametricTest(int parametricTest) {
        this.parametricTest = parametricTest;
    }

    public int getParametricTest() { return this.parametricTest; }


}
