package week1;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(getFibonacciFor(47));
    }

    public static long getFibonacciFor(int n) {
        long last = 0L;
        long next = 1L;
        long res = 0;
        if (n < 2) {
            return n;
        }
        for (long i = 1L; i < n; i++) {
            res = last + next;
            last = next;
            next = res;
        }
        return res; 
    }

    public static long getFibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}