package week1;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(getFibonacciFor(47));
    }

    public static long getFibonacciFor(int n) {
        long last = 0;
        long next = 1;
        if (n < 2) {
            return n;
        }
        for (long i = 0; i < n; i++) {
            long old_last = last;
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