/*
Rule: FIO02-J
Detect and handle file errors
*/

import java.io.*;

public class R13_FIO02_J {

    public static void noncompliant() throws IOException {

        BufferedReader reader =
        new BufferedReader(new FileReader("file.txt"));

        System.out.println(reader.readLine());

    }

    public static void compliant() {

        try {

            BufferedReader reader =
            new BufferedReader(new FileReader("file.txt"));

            System.out.println(reader.readLine());

            reader.close();

        } catch(IOException e) {

            System.out.println("File error");

        }

    }

    public static void main(String[] args) {

        try {
            noncompliant();
        } catch(Exception e) {
            System.out.println("error");
        }

        compliant();
    }
}
