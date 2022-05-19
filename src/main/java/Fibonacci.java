
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(getFibonacci(47));
    }

    public static int getFibonacciFor(int n) {
        int last = 0;
        int next = 0;
        if (n < 2) {
            return n;
        }
        for (int i = 0; i < n; i++) {
            int old_last = last;
            last = next;
            next = old_last + next;
        }
        return next;
    }

    public static long getFibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}