package week1;
public class Fakultaet {

    public static void main(String[] args) {
        System.out.println(fakultätRekursiv(12));
    }

    public static int fakultätFor(int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res = res * (i +1);
        }
        return res;
    }

    public static int fakultätWhile(int n) {
        int res = 1;
        int i = 1;
        while (i<n) {
            i++;
            res = res * i;
        }
        return res;
    }

    public static int fakultätRekursiv(int n) {
        return n <= 1 ? 1 : fakultätRekursiv(n-1) * n;
    }
}
