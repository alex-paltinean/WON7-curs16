package src.org.fasttrackid.recursion;

public class RecursionExercises {

    public static void main(String[] args) {
        printRec(6);
        System.out.println(computeSum(4));
        System.out.println(computeSum2(4));
    }

    // print all numbers from n to 0
    public static void printRec(int n) {
        if (n == -1) {
            return;
        }
        // part 1: print n
        System.out.println(n);
        // part 2: print all numbers from (n-1) to 0
        printRec(n - 1);
    }

    // compute sum of all numbers from n to 1
    public static int computeSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + computeSum(n - 1);
        // n + computeSum(n-1)
        // n + n-1 + computeSum(n-2)
        // n + n-1 + n-2 + computeSum(n-3)
        //...
        // n + n-1 + n-2 + ... + computeSum(1)
        // n + n-1 + n-2 + ... + 1
    }

    public static int computeSum2(int n) {
        return computeSum2(n, 1);
    }

    private static int computeSum2(int n, int i) {
        if (n == i) {
            return n;
        }
        return i + computeSum2(n, i + 1);
    }
}
