package lab1;

public class Multiples {
    public static void main(String[] args) {
//        int[] multipleFigures = {3, 5};
//        int limit = 1000;
//        int count = multiplesFull(limit, multipleFigures, 0);

        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }
        return count;
    }

//    private static int multiplesFull(int limit, int[] multipleFigures, int count) {
//        for (int i = 1; i < limit; i++) {
//            if (isMultiple(i, multipleFigures)) {
//                count++;
//            }
//        }
//        return count;
//    }

//    private static boolean isMultiple(int input, int[] figures) {
//        boolean valid = false;
//        for (int i = 0; i < figures.length; i++) {
//            if (input % figures[i] == 0) {
//                valid = true;
//            }
//        }
//        return valid;
//    }
}
