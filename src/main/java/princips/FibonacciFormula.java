package princips;

import static java.lang.Math.*;

public class FibonacciFormula {
    public static long formula(int n) {
        double goldenRatio = (1. + sqrt(5.)) / 2.;
        double notGoldenRatio = (1. - sqrt(5.)) / 2.;
        double result = (pow(goldenRatio,(double) n) - pow(notGoldenRatio,(double)n)) / sqrt(5.);
        return round(result);
    }
}
