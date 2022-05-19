public class Arrays {
    public static void main(String[] args) {
        int[] nArr = {1,2,3,4};
        int test = ArraySum(nArr);
        System.out.println(test);
    }

    public static int ArraySum(int[] nArr) {
    
        int[] resArr = ArraySumInternal(nArr);
        return resArr[0];
    }

    public static int[] ArraySumInternal(int[] nArr) {
        if (nArr.length == 1) {
            return nArr;
        }

        int[] newArr = java.util.Arrays.copyOf(nArr, nArr.length - 1);
        newArr[newArr.length - 1] = nArr[nArr.length - 1] + nArr[nArr.length- 2];
        return ArraySumInternal(newArr);
    }

    public static String[] studentsMethod(int n) {
        if (n < 0) {
            return new String[0];
        }
        String[] students = new String[n];
        for (int i = 0; i < n; i++) {
            students[i] = "Student " + i;
        }
        return students;
    }
}
