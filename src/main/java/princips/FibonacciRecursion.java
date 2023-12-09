package princips;

public class FibonacciRecursion {
    public static long recursion(int n) {
        if(n <= 1) {
            return n;
        }
        return recursion(n-1) + recursion(n-2);
    }
}
