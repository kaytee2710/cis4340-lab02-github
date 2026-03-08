/*
Rule: STR03-J
Do not encode noncharacter data as a string 
*/

import java.math.BigInteger;

public class R04_STR03_J {

    public static void noncompliant() {

        BigInteger x = new BigInteger("530500452766");

        byte[] byteArray = x.toByteArray();

        String s = new String(byteArray);

        byteArray = s.getBytes();

        x = new BigInteger(byteArray);

        System.out.println(x);
    }

    public static void compliant() {

        BigInteger x = new BigInteger("530500452766");

        String s = x.toString();

        byte[] byteArray = s.getBytes();

        String ns = new String(byteArray);

        x = new BigInteger(ns);

        System.out.println(x);
    }

    public static void main(String[] args) {
        noncompliant();
        compliant();
    }
}
