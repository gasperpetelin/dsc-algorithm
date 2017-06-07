package ResponseHandler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ResponseHandlerTest
{

    private String customJsonwith21Examples = "{\n" +
            " \"alpha\":   0.05,\n" +
            "\"data\": [\n" +
            " {\n" +
            " \"name\": \"BSifeg\",\n" +
            "\"problems\": [\n" +
            " {\n" +
            " \"name\": \"f1\",\n" +
            "\"data\": [ \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f2\",\n" +
            "\"data\": [ \"+2.466208571e-09\", \"+1.078518608e-09\", \"+1.731123689e-09\", \"+3.650939107e-09\", \"+3.151299666e-09\", \"+3.495983947e-09\", \"+3.043467700e-10\", \"+2.355882600e-09\", \"+1.583316589e-09\", \"+3.971990736e-09\", \"+1.964025387e-09\", \"+1.656744075e-09\", \"+9.741413010e-09\", \"+7.680299063e-09\", \"+5.863967090e-09\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f3\",\n" +
            "\"data\": [ \"+6.480149750e-11\", \"+4.772005013e-11\", \"+2.031697477e-09\", \"+2.531619359e-11\", \"+7.204050689e-10\", \"+3.515339131e-10\", \"+1.489297574e-11\", \"+3.835793905e-10\", \"+6.641916794e-09\", \"+2.450867953e-09\", \"+1.033413355e-10\", \"+2.229967322e-10\", \"+4.504670414e-09\", \"+1.575500619e-09\", \"+3.508038304e-10\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f4\",\n" +
            "\"data\": [ \"+8.945562513e-09\", \"+5.917897283e-09\", \"+1.340112021e-09\", \"+9.533336787e-09\", \"+6.317208090e-09\", \"+2.442149594e-09\", \"+5.856520602e-09\", \"+1.738897026e-09\", \"+3.337241150e-09\", \"+4.370406259e-10\", \"+4.668891052e-09\", \"+5.255159863e-09\", \"+5.789090096e-09\", \"+8.393044482e-09\", \"+1.842309416e-09\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f5\",\n" +
            "\"data\": [ \"-7.105427358e-15\", \"+0.000000000e+00\", \"-1.421085472e-14\", \"+0.000000000e+00\", \"+1.421085472e-14\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+1.421085472e-14\", \"+0.000000000e+00\", \"-1.065814104e-14\", \"-2.842170943e-14\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f6\",\n" +
            "\"data\": [ \"+2.479110491e+01\", \"+9.980282245e+00\", \"+1.553920992e+01\", \"+3.980174669e-01\", \"+2.471134467e+01\", \"+6.282016722e+01\", \"+9.375572589e+00\", \"+2.380840485e+01\", \"+2.486924249e+01\", \"+3.787973187e+00\", \"+6.297496771e+00\", \"+9.998344630e+00\", \"+2.501686661e+01\", \"+6.282842165e+00\", \"+8.752771699e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f7\",\n" +
            "\"data\": [ \"+1.573044101e+01\", \"+9.799203433e+00\", \"+6.138662911e+00\", \"+9.193283794e+00\", \"+2.371196722e+01\", \"+1.432929306e+01\", \"+1.545948205e+01\", \"+2.370452608e+01\", \"+6.128365587e+00\", \"+7.196269136e+00\", \"+1.498462814e+01\", \"+1.573124369e+01\", \"+1.575308606e+01\", \"+3.084108245e+00\", \"+1.333831226e+01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f8\",\n" +
            "\"data\": [ \"+3.800343207e-01\", \"+6.309543725e-02\", \"+9.999280454e-01\", \"+3.842600113e-01\", \"+9.894323854e-03\", \"+1.459921648e-01\", \"+6.105808441e-01\", \"+1.486492593e-01\", \"+2.406418318e-05\", \"+9.993844705e-01\", \"+6.298296350e+00\", \"+2.496521859e+00\", \"+6.309247703e+00\", \"+9.879583504e-01\", \"+1.584815905e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f9\",\n" +
            "\"data\": [ \"+6.280183693e-01\", \"+9.658213925e+00\", \"+9.969403334e+00\", \"+8.953557700e-01\", \"+6.303065093e+00\", \"+6.308432140e+00\", \"+9.417320939e+00\", \"+9.998643876e+00\", \"+6.232295634e+00\", \"+9.473593393e+00\", \"+6.308693111e+00\", \"+9.872447052e+00\", \"+9.770516673e+00\", \"+6.298958479e+00\", \"+6.304167887e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f10\",\n" +
            "\"data\": [ \"+3.925658224e+04\", \"+2.472035376e+04\", \"+9.675953094e+04\", \"+2.484535936e+04\", \"+2.467194687e+03\", \"+6.302239291e+04\", \"+9.477146123e+03\", \"+3.960840464e+03\", \"+3.980304374e+04\", \"+9.186697568e+03\", \"+9.986492577e+03\", \"+3.944850604e+03\", \"+1.491320207e+04\", \"+5.995084086e+03\", \"+6.288681550e+04\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f11\",\n" +
            "\"data\": [ \"+5.592599070e+01\", \"+9.954464825e+01\", \"+9.441664693e+01\", \"+8.990252362e+01\", \"+6.011640638e+01\", \"+7.246049278e+01\", \"+7.147633297e+01\", \"+8.468600417e+01\", \"+9.240859043e+01\", \"+8.088957227e+01\", \"+1.101432115e+02\", \"+9.438462062e+01\", \"+9.923768792e+01\", \"+5.252008691e+01\", \"+5.058247163e+01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f12\",\n" +
            "\"data\": [ \"+6.118890663e+00\", \"+3.901726866e+00\", \"+2.254236264e+00\", \"+5.030083956e+00\", \"+2.361237496e+01\", \"+1.453443862e+01\", \"+3.118765268e+02\", \"+2.449052972e+02\", \"+1.318037088e+01\", \"+2.441276100e+02\", \"+2.488797689e+00\", \"+1.567313338e+01\", \"+2.303617892e+01\", \"+6.047371282e+01\", \"+9.236975325e+01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f13\",\n" +
            "\"data\": [ \"+6.192002989e+00\", \"+6.160783256e-01\", \"+9.146109782e-01\", \"+9.886207126e-01\", \"+9.709578821e-01\", \"+3.908879845e+00\", \"+1.464403961e-01\", \"+2.443211469e+00\", \"+5.685520895e-01\", \"+3.980706691e+00\", \"+2.495507684e+00\", \"+1.539845787e+01\", \"+3.972444615e-01\", \"+9.999602061e-01\", \"+2.425810759e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f14\",\n" +
            "\"data\": [ \"+2.509332842e-03\", \"+2.509064498e-03\", \"+3.961569239e-03\", \"+1.580308402e-03\", \"+1.583926109e-03\", \"+2.509500691e-03\", \"+3.945516336e-03\", \"+3.980412366e-03\", \"+1.584130210e-03\", \"+2.509713430e-03\", \"+3.949912020e-03\", \"+3.979104065e-03\", \"+2.479559272e-03\", \"+3.957231645e-03\", \"+1.579669714e-03\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f15\",\n" +
            "\"data\": [ \"+9.811955258e+01\", \"+9.994738704e+01\", \"+6.283197179e+01\", \"+9.954873344e+01\", \"+6.218501003e+01\", \"+2.503591133e+01\", \"+9.813039319e+01\", \"+6.239729378e+01\", \"+6.297661945e+01\", \"+6.308192050e+01\", \"+9.908903328e+01\", \"+6.207228085e+01\", \"+1.584882276e+02\", \"+9.703917118e+01\", \"+9.999432294e+01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f16\",\n" +
            "\"data\": [ \"+3.843704799e+00\", \"+6.161865413e+00\", \"+6.300234007e+00\", \"+5.852654690e+00\", \"+3.969846104e+00\", \"+5.733918449e-01\", \"+6.218618972e+00\", \"+2.508002132e+00\", \"+6.212772920e+00\", \"+3.919717667e+00\", \"+9.978246000e+00\", \"+3.883635000e+00\", \"+2.467226776e+00\", \"+3.919597129e+00\", \"+2.504771474e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f17\",\n" +
            "\"data\": [ \"+3.975409710e+00\", \"+2.247298764e+00\", \"+3.750502795e+00\", \"+6.190569655e+00\", \"+9.877062380e+00\", \"+9.403017118e+00\", \"+1.584051258e+00\", \"+5.765235405e+00\", \"+5.583002896e+00\", \"+6.302193201e+00\", \"+3.845786587e+00\", \"+9.630807498e+00\", \"+3.896144774e+00\", \"+6.308520378e+00\", \"+6.269217526e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f18\",\n" +
            "\"data\": [ \"+1.572589592e+01\", \"+1.583498574e+01\", \"+2.485331455e+00\", \"+6.309512587e+00\", \"+7.897166174e+00\", \"+3.734530688e+01\", \"+9.996695966e+00\", \"+9.948865028e+00\", \"+1.571841226e+01\", \"+1.437309244e+01\", \"+3.908408730e+01\", \"+2.466533337e+01\", \"+9.997330963e+00\", \"+2.321097861e+01\", \"+2.511632367e+01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f19\",\n" +
            "\"data\": [ \"+1.101540298e+00\", \"+1.468267758e+00\", \"+1.406006732e+00\", \"+1.583830966e+00\", \"+2.141050179e+00\", \"+1.416004273e+00\", \"+2.476315220e+00\", \"+1.560769066e+00\", \"+1.434784298e+00\", \"+2.036409979e+00\", \"+9.959114997e-01\", \"+2.391098975e+00\", \"+1.582774125e+00\", \"+1.512977496e+00\", \"+1.513817875e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f20\",\n" +
            "\"data\": [ \"+1.466536297e+00\", \"+3.601809425e-01\", \"+6.261626629e-01\", \"+1.494084816e+00\", \"+6.281288876e-01\", \"+5.576970745e-01\", \"+9.754908489e-01\", \"+1.543560732e+00\", \"+9.783830469e-01\", \"+6.092032063e-01\", \"+9.099736810e-01\", \"+9.250038079e-01\", \"+9.941666881e-01\", \"+9.907512373e-01\", \"+6.119572247e-01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f21\",\n" +
            "\"data\": [ \"+2.510426335e+00\", \"+3.979062531e+00\", \"+9.619881795e+00\", \"+8.997064414e-01\", \"+3.980275088e+00\", \"+3.857273931e+00\", \"+8.458790717e-07\", \"+1.534357388e+00\", \"+3.968675312e+00\", \"+9.971390774e+00\", \"+9.635042736e+00\", \"+6.299934147e+00\", \"+2.363274898e+00\", \"+3.980476515e+01\", \"+2.506723691e+01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f22\",\n" +
            "\"data\": [ \"+3.980619565e-03\", \"+2.511381641e+01\", \"+9.580914667e+00\", \"+2.511494832e+00\", \"+8.380766589e+01\", \"+6.284153122e-02\", \"+2.502937150e-02\", \"+2.454197536e+00\", \"+3.972205886e+00\", \"+2.509842017e-04\", \"+9.994179562e-01\", \"+2.503912126e+01\", \"+2.322828845e+00\", \"+2.349856195e+01\", \"+6.214411810e+01\" ] \n" +
            "} \n" +
            "] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"BSrr\",\n" +
            "\"problems\": [\n" +
            " {\n" +
            " \"name\": \"f1\",\n" +
            "\"data\": [ \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f2\",\n" +
            "\"data\": [ \"+7.801475022e-10\", \"+7.423892612e-10\", \"+1.526373694e-09\", \"+8.545839592e-10\", \"+1.770388280e-10\", \"+7.004246072e-10\", \"+3.065636633e-10\", \"+1.554290918e-09\", \"+9.984887583e-09\", \"+2.197623417e-09\", \"+2.394173748e-09\", \"+1.622709078e-09\", \"+2.103632823e-09\", \"+8.418510333e-10\", \"+3.427658157e-10\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f3\",\n" +
            "\"data\": [ \"+5.582137419e-09\", \"+4.997829706e-09\", \"+3.611191346e-09\", \"+2.731592730e-11\", \"+1.397495453e-10\", \"+3.267466298e-09\", \"+1.568878361e-11\", \"+2.080469130e-11\", \"+2.442726021e-10\", \"+3.274415405e-09\", \"+1.145963324e-10\", \"+2.402273935e-09\", \"+8.984102351e-11\", \"+1.631690338e-09\", \"+2.085833728e-10\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f4\",\n" +
            "\"data\": [ \"+8.938911833e-09\", \"+8.247397432e-09\", \"+2.545277766e-09\", \"+3.269344795e-10\", \"+6.294584409e-09\", \"+2.755591311e-09\", \"+9.522409528e-10\", \"+4.477954008e-09\", \"+2.057819248e-09\", \"+2.583519176e-09\", \"+3.404124982e-09\", \"+1.813731387e-09\", \"+6.049248213e-09\", \"+4.743256454e-09\", \"+4.075271676e-09\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f5\",\n" +
            "\"data\": [ \"-7.105427358e-15\", \"+0.000000000e+00\", \"-1.421085472e-14\", \"+0.000000000e+00\", \"+1.421085472e-14\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+1.421085472e-14\", \"+0.000000000e+00\", \"-1.065814104e-14\", \"-2.842170943e-14\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f6\",\n" +
            "\"data\": [ \"+6.188532894e+00\", \"+1.570822954e+01\", \"+3.947136418e+00\", \"+2.508698103e-01\", \"+2.371524541e+01\", \"+6.305048438e+01\", \"+8.518096384e+00\", \"+2.489187405e+01\", \"+2.452773060e+01\", \"+6.259147921e+01\", \"+1.584864633e+01\", \"+1.569737190e-01\", \"+2.508516548e+01\", \"+9.945386981e+00\", \"+1.516148315e+01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f7\",\n" +
            "\"data\": [ \"+6.205508610e+00\", \"+1.437900038e+01\", \"+1.248529443e+01\", \"+1.491800978e+01\", \"+1.526853258e+01\", \"+9.917748195e+00\", \"+1.400238237e+01\", \"+9.643281761e+00\", \"+5.872338039e+00\", \"+8.785726778e+00\", \"+2.095093885e+01\", \"+9.966981344e+00\", \"+7.335696790e+00\", \"+9.979717138e+00\", \"+1.327610929e+01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f8\",\n" +
            "\"data\": [ \"+6.308964478e+00\", \"+9.780460681e-02\", \"+9.955598304e-03\", \"+1.479956794e-02\", \"+2.492818796e-02\", \"+9.812374144e-02\", \"+6.306499523e+00\", \"+3.886079869e-01\", \"+1.379946639e-02\", \"+1.580588704e+00\", \"+2.510356373e+00\", \"+3.979732590e+00\", \"+6.239618334e-02\", \"+9.973480499e-01\", \"+9.892406154e-02\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f9\",\n" +
            "\"data\": [ \"+6.063697967e-01\", \"+9.999553948e+00\", \"+3.981036400e+00\", \"+6.296289667e-01\", \"+6.308408699e+00\", \"+6.296811715e+00\", \"+9.926569427e+00\", \"+9.905768620e+00\", \"+6.282442021e+00\", \"+6.305956299e+00\", \"+6.307144066e+00\", \"+6.301636427e+00\", \"+9.834263058e+00\", \"+9.995812995e+00\", \"+6.302427471e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f10\",\n" +
            "\"data\": [ \"+1.578079698e+04\", \"+2.497191722e+03\", \"+2.449236335e+04\", \"+6.291653271e+04\", \"+2.509098790e+03\", \"+3.923833143e+04\", \"+1.581165836e+04\", \"+6.295512437e+03\", \"+3.952318281e+04\", \"+9.993351611e+03\", \"+9.857469352e+03\", \"+2.489142524e+03\", \"+6.308043794e+04\", \"+9.129370354e+03\", \"+6.295957664e+04\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f11\",\n" +
            "\"data\": [ \"+1.848660974e+02\", \"+3.769167725e+01\", \"+8.913166188e+01\", \"+1.541199166e+02\", \"+8.463354408e+01\", \"+4.060709147e+01\", \"+7.147633297e+01\", \"+9.202272768e+01\", \"+9.240859043e+01\", \"+5.071630509e+01\", \"+1.303764586e+02\", \"+9.473922897e+01\", \"+9.914975821e+01\", \"+3.082879943e+01\", \"+6.299116718e+01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f12\",\n" +
            "\"data\": [ \"+5.875669920e-01\", \"+2.283597303e+00\", \"+3.966174303e+00\", \"+3.638351256e-01\", \"+1.555497987e+00\", \"+6.153510754e+00\", \"+2.291679622e+01\", \"+1.546600140e+02\", \"+5.855708572e+00\", \"+2.461158531e+01\", \"+3.927983301e+00\", \"+1.584432909e+00\", \"+2.344548899e+00\", \"+3.657696775e+01\", \"+1.810078511e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f13\",\n" +
            "\"data\": [ \"+3.886109160e+00\", \"+3.971175490e+00\", \"+2.459479802e+00\", \"+6.277512923e+00\", \"+3.543170477e-01\", \"+1.542656259e+00\", \"+1.515705765e-01\", \"+3.980802849e+00\", \"+6.271748574e+00\", \"+2.506912793e+00\", \"+6.273728002e+00\", \"+6.299854870e-01\", \"+6.219127013e-02\", \"+3.980899972e+00\", \"+9.984943762e-01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f14\",\n" +
            "\"data\": [ \"+2.509600576e-03\", \"+1.567038239e-03\", \"+9.999266632e-04\", \"+3.940164831e-03\", \"+2.498541542e-03\", \"+2.500084494e-03\", \"+2.508620987e-03\", \"+3.979009330e-03\", \"+1.578709181e-03\", \"+2.508443788e-03\", \"+3.944223910e-03\", \"+2.501991745e-03\", \"+2.507652049e-03\", \"+2.511526067e-03\", \"+1.583025137e-03\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f15\",\n" +
            "\"data\": [ \"+9.996896641e+01\", \"+1.582292553e+02\", \"+6.251429962e+01\", \"+6.301370660e+01\", \"+3.972470404e+01\", \"+2.503449207e+01\", \"+6.296081411e+01\", \"+3.974004687e+01\", \"+9.827797455e+01\", \"+3.920659500e+01\", \"+9.888298886e+01\", \"+3.910259905e+01\", \"+1.584863795e+02\", \"+9.795013858e+01\", \"+6.273011060e+01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f16\",\n" +
            "\"data\": [ \"+2.495653693e+00\", \"+9.969979471e+00\", \"+2.384610294e+00\", \"+2.499732626e+00\", \"+9.972383642e+00\", \"+2.500316594e+00\", \"+3.971639156e+00\", \"+5.613870609e+00\", \"+9.962494514e+00\", \"+3.969153147e+00\", \"+2.401611836e+00\", \"+6.052768526e+00\", \"+6.149477694e+00\", \"+2.510604669e+00\", \"+6.187841346e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f17\",\n" +
            "\"data\": [ \"+2.503271782e+00\", \"+3.961571036e+00\", \"+3.609737039e+00\", \"+6.309308263e+00\", \"+9.877062380e+00\", \"+9.403017118e+00\", \"+2.507484738e+00\", \"+3.979393393e+00\", \"+5.583002896e+00\", \"+6.302193201e+00\", \"+2.511880836e+00\", \"+9.630807498e+00\", \"+6.281392431e+00\", \"+3.980741178e+00\", \"+6.269217526e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f18\",\n" +
            "\"data\": [ \"+6.080471670e+00\", \"+2.470364852e+01\", \"+9.997805095e+00\", \"+9.903946227e+00\", \"+2.511853248e+01\", \"+3.734530688e+01\", \"+3.976102607e+00\", \"+9.908078315e+00\", \"+1.584382123e+01\", \"+1.437309244e+01\", \"+2.500352228e+01\", \"+2.510062936e+01\", \"+9.933889070e+00\", \"+2.321097861e+01\", \"+2.475430884e+01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f19\",\n" +
            "\"data\": [ \"+1.395074912e+00\", \"+9.939779558e-01\", \"+1.505318277e+00\", \"+1.577877816e+00\", \"+1.581019228e+00\", \"+9.963384580e-01\", \"+1.565147608e+00\", \"+2.038392941e+00\", \"+1.580848879e+00\", \"+3.964109009e+00\", \"+1.568714857e+00\", \"+9.939030756e-01\", \"+1.571392124e+00\", \"+6.143158098e-01\", \"+1.163954270e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f20\",\n" +
            "\"data\": [ \"+9.015659104e-01\", \"+8.170762776e-01\", \"+3.584380042e-01\", \"+1.498107158e+00\", \"+5.175554029e-01\", \"+5.108656079e-01\", \"+9.872457804e-01\", \"+9.835024788e-01\", \"+6.250064548e-01\", \"+2.504056450e-01\", \"+8.076520304e-01\", \"+1.581603699e+00\", \"+6.062822761e-01\", \"+9.998096249e-01\", \"+9.995851815e-01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f21\",\n" +
            "\"data\": [ \"+2.498100981e+00\", \"+3.968171503e+00\", \"+9.764275097e-05\", \"+8.997064414e-01\", \"+3.957868419e+00\", \"+3.860224216e+00\", \"+2.376689486e+00\", \"+9.994138850e-09\", \"+6.293675219e+00\", \"+9.972266517e+00\", \"+6.297531424e+00\", \"+9.954720553e+00\", \"+2.363274898e+00\", \"+3.939798503e+01\", \"+2.511727704e+01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f22\",\n" +
            "\"data\": [ \"+2.102493600e+00\", \"+2.508161488e+01\", \"+9.872312031e-01\", \"+3.965064084e+00\", \"+8.380766589e+01\", \"+6.306971711e-02\", \"+1.575944889e-01\", \"+2.454197536e+00\", \"+3.900085330e+01\", \"+3.794175166e-05\", \"+9.991034697e-01\", \"+3.974242747e+00\", \"+1.582339587e-01\", \"+2.349856195e+01\", \"+6.214411810e+01\" ] \n" +
            "} \n" +
            "] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"Srr\",\n" +
            "\"problems\": [\n" +
            " {\n" +
            " \"name\": \"f1\",\n" +
            "\"data\": [ \"+9.964409742e-09\", \"+9.780592336e-09\", \"+6.139117659e-09\", \"+4.473207582e-09\", \"+6.994365975e-09\", \"+6.208434211e-09\", \"+7.366390165e-09\", \"+5.945025805e-09\", \"+8.963929155e-09\", \"+9.895870789e-09\", \"+6.900847893e-09\", \"+9.196853057e-09\", \"+3.585334696e-09\", \"+5.575913065e-09\", \"+5.586286989e-09\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f2\",\n" +
            "\"data\": [ \"+5.757101462e-09\", \"+5.214445764e-09\", \"+8.701334764e-09\", \"+3.940954230e-09\", \"+9.351708741e-09\", \"+9.197606232e-09\", \"+6.258510155e-09\", \"+8.652861538e-09\", \"+5.235847311e-09\", \"+6.612594916e-09\", \"+3.743238608e-09\", \"+9.268028123e-09\", \"+4.559844058e-09\", \"+3.648324309e-09\", \"+2.961456858e-09\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f3\",\n" +
            "\"data\": [ \"+6.864695479e-09\", \"+8.638224358e-09\", \"+9.380372035e-09\", \"+9.449514060e-09\", \"+5.469416919e-09\", \"+8.270141905e-09\", \"+5.163940386e-09\", \"+6.088612281e-09\", \"+9.302936643e-09\", \"+9.514948829e-09\", \"+8.027996046e-09\", \"+9.012055102e-09\", \"+8.161329390e-09\", \"+3.779845770e-09\", \"+7.670228896e-09\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f4\",\n" +
            "\"data\": [ \"+1.105149749e-09\", \"+9.524427469e-09\", \"+5.878106890e-09\", \"+4.887233285e-09\", \"+3.166604756e-09\", \"+1.706084163e-09\", \"+4.669118425e-10\", \"+4.145590538e-10\", \"+6.642292050e-09\", \"+5.609948062e-10\", \"+5.707079254e-10\", \"+4.659739261e-10\", \"+3.480856492e-09\", \"+4.087326033e-10\", \"+3.397211401e-09\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f5\",\n" +
            "\"data\": [ \"-7.105427358e-15\", \"+0.000000000e+00\", \"-1.421085472e-14\", \"+0.000000000e+00\", \"+1.421085472e-14\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+1.421085472e-14\", \"+0.000000000e+00\", \"-1.065814104e-14\", \"-2.842170943e-14\", \"+0.000000000e+00\", \"+0.000000000e+00\", \"+0.000000000e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f6\",\n" +
            "\"data\": [ \"+9.990413628e-01\", \"+6.296528242e+00\", \"+9.926151551e-02\", \"+1.551730207e+00\", \"+1.556664916e+01\", \"+1.474594920e+01\", \"+3.977004698e+00\", \"+3.954835704e-02\", \"+1.542765062e+01\", \"+9.983854318e-01\", \"+3.939736324e+00\", \"+9.986242188e-01\", \"+6.308472524e-01\", \"+2.509840221e-01\", \"+1.576488403e-01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f7\",\n" +
            "\"data\": [ \"+3.964398542e+00\", \"+3.975169378e+00\", \"+2.268175780e+00\", \"+3.949081704e+00\", \"+8.494934314e+00\", \"+3.621270820e+00\", \"+8.896669334e+00\", \"+9.503489340e+00\", \"+3.731419530e+00\", \"+6.002126230e+00\", \"+1.555389430e+01\", \"+1.530725162e+01\", \"+2.461196009e+00\", \"+6.095877199e+00\", \"+9.800668741e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f8\",\n" +
            "\"data\": [ \"+6.305517845e+00\", \"+6.248179092e+00\", \"+2.486524632e-03\", \"+2.488985230e-01\", \"+6.252262314e-01\", \"+3.913898931e-02\", \"+9.925526317e-01\", \"+5.968614277e-01\", \"+1.527412878e+00\", \"+2.500448334e+00\", \"+2.497464142e+00\", \"+6.013097691e-01\", \"+1.582456063e-04\", \"+1.468022137e+00\", \"+1.580894545e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f9\",\n" +
            "\"data\": [ \"+6.274851513e+00\", \"+6.301976243e+00\", \"+3.977427689e+00\", \"+1.575315129e+00\", \"+6.306118895e+00\", \"+6.308248496e+00\", \"+6.292959610e+00\", \"+6.307972813e+00\", \"+9.368401993e+00\", \"+3.975861371e+00\", \"+6.293858834e+00\", \"+6.306170484e+00\", \"+6.283860031e+00\", \"+6.224491631e+00\", \"+6.306743721e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f10\",\n" +
            "\"data\": [ \"+2.365835859e+04\", \"+3.640348589e+03\", \"+1.569293738e+04\", \"+1.570750991e+04\", \"+9.974418300e+02\", \"+2.506090100e+04\", \"+1.579382967e+03\", \"+3.900298583e+03\", \"+2.501644915e+04\", \"+1.584637544e+03\", \"+3.980806431e+03\", \"+2.462220946e+03\", \"+1.451472695e+04\", \"+3.952426053e+03\", \"+1.523560338e+04\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f11\",\n" +
            "\"data\": [ \"+2.255592902e+02\", \"+3.925395065e+01\", \"+8.186193303e+01\", \"+9.987861779e+01\", \"+5.862473097e+01\", \"+3.922654872e+01\", \"+5.685829251e+01\", \"+9.064235744e+01\", \"+9.240859043e+01\", \"+5.230256539e+01\", \"+1.242523997e+02\", \"+9.786140922e+01\", \"+9.998643798e+01\", \"+3.061474319e+01\", \"+6.109292519e+01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f12\",\n" +
            "\"data\": [ \"+1.500316925e-01\", \"+1.996572546e-01\", \"+3.518288351e-02\", \"+2.041091417e+00\", \"+2.395641911e+00\", \"+1.465704672e+01\", \"+1.582470994e+01\", \"+6.178384484e+04\", \"+6.197221160e+00\", \"+7.164113913e+00\", \"+4.996861227e-02\", \"+6.196675512e+00\", \"+2.341183052e+00\", \"+1.544369129e+01\", \"+1.496711293e+01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f13\",\n" +
            "\"data\": [ \"+1.511444300e-01\", \"+1.582660064e+00\", \"+6.183828609e+00\", \"+3.120960730e-02\", \"+9.718259051e-02\", \"+6.116343703e-02\", \"+8.228401262e-02\", \"+3.935848189e+00\", \"+1.584080751e+00\", \"+2.469659023e-01\", \"+2.380823082e-01\", \"+9.151159727e-02\", \"+2.481841117e-01\", \"+3.701270110e-02\", \"+6.094615169e-01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f14\",\n" +
            "\"data\": [ \"+2.508466751e-03\", \"+1.583855119e-03\", \"+1.582914932e-03\", \"+9.949020074e-04\", \"+2.511023404e-03\", \"+2.509187178e-03\", \"+2.511177707e-03\", \"+2.466901331e-03\", \"+3.964273093e-03\", \"+1.580418798e-03\", \"+2.481027954e-03\", \"+2.503782654e-03\", \"+2.511231824e-03\", \"+2.502683554e-03\", \"+1.584795349e-03\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f15\",\n" +
            "\"data\": [ \"+3.953911727e+01\", \"+9.969900267e+01\", \"+2.508070917e+01\", \"+6.301555097e+01\", \"+3.937050821e+01\", \"+6.273645066e+01\", \"+6.176497751e+01\", \"+2.457499281e+01\", \"+3.957412968e+01\", \"+3.977506156e+01\", \"+9.908537858e+01\", \"+8.922165836e+01\", \"+9.768625555e+01\", \"+5.980664499e+01\", \"+2.510371838e+01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f16\",\n" +
            "\"data\": [ \"+3.945808928e+00\", \"+2.350980877e+00\", \"+3.975932122e+00\", \"+3.958004085e+00\", \"+2.427401651e+00\", \"+3.809519116e+00\", \"+6.290559099e-01\", \"+1.581658705e+00\", \"+3.970463733e+00\", \"+3.964628616e+00\", \"+2.396025697e+00\", \"+1.553009203e+00\", \"+1.538938106e+00\", \"+1.528110004e+00\", \"+1.526869503e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f17\",\n" +
            "\"data\": [ \"+6.237511850e+00\", \"+2.511366895e+00\", \"+1.566601336e+00\", \"+3.245915207e+00\", \"+9.877062380e+00\", \"+9.883403097e+00\", \"+1.569417527e+00\", \"+3.849712617e+00\", \"+2.274916516e+00\", \"+2.493834099e+00\", \"+2.295868076e+00\", \"+6.175886831e+00\", \"+6.282843876e+00\", \"+6.097045735e+00\", \"+2.506644676e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f18\",\n" +
            "\"data\": [ \"+2.484442270e+01\", \"+1.434143612e+01\", \"+3.882611685e+00\", \"+9.862128505e+00\", \"+9.937581903e+00\", \"+1.584248567e+01\", \"+6.121719677e+00\", \"+9.693050264e+00\", \"+3.930474287e+00\", \"+9.908745837e+00\", \"+2.346065586e+01\", \"+6.307082633e+00\", \"+6.309367787e+00\", \"+6.305431763e+00\", \"+3.970374426e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f19\",\n" +
            "\"data\": [ \"+2.268497169e+00\", \"+6.295338188e-01\", \"+1.526082248e+00\", \"+7.184315130e-01\", \"+9.815726185e-01\", \"+1.561842973e+00\", \"+9.398060141e-01\", \"+1.582406837e+00\", \"+6.276577213e-01\", \"+9.936678310e-01\", \"+6.044604503e-01\", \"+6.299688564e-01\", \"+1.577789204e+00\", \"+6.278103423e-01\", \"+9.968937186e-01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f20\",\n" +
            "\"data\": [ \"+8.578423709e-01\", \"+9.745605725e-01\", \"+8.132297744e-01\", \"+8.720343254e-01\", \"+9.020969032e-01\", \"+9.977981942e-01\", \"+6.284369909e-01\", \"+4.887440995e-01\", \"+9.322591248e-01\", \"+6.309040308e-01\", \"+9.946530604e-01\", \"+2.489704670e-01\", \"+9.125243241e-01\", \"+1.462636139e+00\", \"+6.126850673e-01\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f21\",\n" +
            "\"data\": [ \"+2.501664547e+00\", \"+3.976995444e+00\", \"+2.366033414e-08\", \"+9.857362639e-01\", \"+3.961147697e+00\", \"+3.916961623e+00\", \"+2.051026029e+00\", \"+3.896803946e-08\", \"+3.844750001e-06\", \"+9.893383757e+00\", \"+6.299064486e+00\", \"+9.956504582e+00\", \"+2.125598320e+00\", \"+3.831559929e+01\", \"+2.403051719e+00\" ] \n" +
            "},\n" +
            "{\n" +
            " \"name\": \"f22\",\n" +
            "\"data\": [ \"+2.237134800e+00\", \"+2.511821765e+01\", \"+6.049170745e-02\", \"+3.768975106e+00\", \"+8.380766589e+01\", \"+2.511350931e-02\", \"+6.294820155e-02\", \"+2.357347015e+00\", \"+6.260479360e+00\", \"+3.979123433e-03\", \"+9.987800111e-01\", \"+3.856999529e+00\", \"+1.580462104e-02\", \"+2.412865172e+01\", \"+3.776175522e+01\" ] \n" +
            "} \n" +
            "] \n" +
            "} \n" +
            "] \n" +
            "}";
    @Test
    void generateResponse()
    {
        ResponseHandler.generateResponse(this.customJsonwith21Examples);
    }

}