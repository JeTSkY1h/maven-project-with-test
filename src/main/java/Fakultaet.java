public class Fakultaet {
    public static void main(String[] args) {
        System.out.println(fakulät(3));
    }

    public static int fakulät(int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(res);
            res = res * (i +1);
        }
        return res;
    }
}
