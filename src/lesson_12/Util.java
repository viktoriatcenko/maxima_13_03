package lesson_12;

public class Util {

    public static int findFactorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x * findFactorial(x -1);
    }
}
