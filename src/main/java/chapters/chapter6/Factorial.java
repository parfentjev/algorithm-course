package chapters.chapter6;

public class Factorial {
    public int headFactorial(int n) {
        if (n == 0) return 1;

        return n * headFactorial(n - 1);
    }

    /**
     * Legends say Java compiler is not able to identify tail recursions.
     */
    public int tailFactorial(int n, int result) {
        if (n == 0) return result;

        return tailFactorial(n - 1, n * result);
    }
}
