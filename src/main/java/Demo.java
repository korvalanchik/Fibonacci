import static princips.FibonacciDinamic.dinamic;
import static princips.FibonacciIteration.iteration;
import static princips.FibonacciRecursion.recursion;

public class Demo {
    public static void main(String[] args) {
        int n = 15;
        long result = dinamic(n);
        System.out.println("Result algoritm DP for n = " + n + " is: " + result);
        result = iteration(n);
        System.out.println("Result algoritm iteration for n = " + n + " is: " + result);
        result = recursion(n);
        System.out.println("Result algoritm recursion for n = " + n + " is: " + result);
    }
}
