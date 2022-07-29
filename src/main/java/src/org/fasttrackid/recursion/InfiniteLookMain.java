package src.org.fasttrackid.recursion;

public class InfiniteLookMain {
    private static long counter = 0;

    public static void main(String[] args) {
        infiniteLoop();
    }

    public static void infiniteLoop() {
        System.out.println(counter++);
        infiniteLoop();
    }
}
