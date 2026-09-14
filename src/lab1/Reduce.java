package lab1;

public class Reduce {
    public static void main(String[] args) {
        int n = 100;

        System.out.println(reduce(n));
    }

    public static int reduce(int n) {
        int count = 0;
        while (n > 0) {
            n = doReduction(n);
            count++;
        }
        return count;
    }

    public static int doReduction(int input) {
        if (input % 2 == 0) {
            return input/2;
        } else {
            return input - 1;
        }
    }
}
