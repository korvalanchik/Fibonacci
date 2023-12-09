package princips;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDinamic {
    private static final Map<Integer, Long> memo = new HashMap<>();
    public static long dinamic(int n) {
        if(n<=1) {
            return n;
        }
        if(memo.containsKey(n)) {
            return memo.get(n);
        }
        long fib = dinamic(n-1) + dinamic(n-2);
        memo.put(n,fib);
        return fib;
    }
}
