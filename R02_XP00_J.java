/*
Rule: EXP00-J
Do not ignore values returned by methods
*/

import java.io.File;

public class R02_XP00_J {

    public static void noncompliant() {
        File file = new File("temp.txt");
        file.delete(); 
    }

    public static void compliant() {
        File file = new File("temp.txt");
        if (!file.delete()) {
            System.out.println("Delete failed.");
        }
    }

    public static void main(String[] args) {
        noncompliant();
        compliant();
    }
}
