/*
Rule: MET01-J
Never use assertions to validate method arguments
*/

public class R06_MET01_J {

    public static int noncompliant(int x, int y) {

        assert x != Integer.MIN_VALUE;

        int absX = Math.abs(x);
        int absY = Math.abs(y);

        return absX + absY;
    }

    public static int compliant(int x, int y) {

        if (x == Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }

        int absX = Math.abs(x);
        int absY = Math.abs(y);

        return absX + absY;
    }

    public static void main(String[] args) {
        compliant(5,4);
    }
}
