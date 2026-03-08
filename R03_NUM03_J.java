/*
Rule: NUM03-J
Use integer types that can fully represent the range of unsigned data
*/

public class R03_NUM03_J {

    public static void noncompliant() {
        byte value = (byte)200;
        System.out.println(value);
    }

    public static void compliant() {
        int value = 200;
        System.out.println(value);
    }

    public static void main(String[] args) {
        noncompliant();
        compliant();
    }
}
