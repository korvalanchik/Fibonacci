package princips;

public class FibonacciIteration {
    public static long iteration(int n) {
        if(n <= 1) {
            return n;
        }
        int prevResult = 0;
        int result = 1;
        int nextResult;
        for (int i=1; i<n; i++) {
            nextResult = prevResult + result;
            prevResult = result;
            result = nextResult;
        }
        return result;
    }

}
