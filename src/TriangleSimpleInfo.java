import com.sun.nio.sctp.SctpSocketOption;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {  // наибольшую сторону
        if ((a >= b) && (a >= c)) return a;
        else if ((b >= a) && (b >= c)) return b;
        else return c;
    }

    public static int minSide(int a, int b, int c) {  // наименьшую сторону
        if ((a <= b) && (a <= c)) return a;
        else if ((b <= a) && (b <= c)) return b;
        else return c;
    }

    public static boolean isEquilateralTriangle(int a, int b, int c) { // равносторонний
        if ((a == b) && (b == c)) return true;
        else return false;
    }


}
