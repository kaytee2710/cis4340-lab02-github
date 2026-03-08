/*
Rule: ERR04-J
Do not complete abruptly from a finally block
*/

public class R07_ERR04_J {

    public static int noncompliant() {

        try {
            return 1;
        } finally {
            return 2;
        }

    }

    public static int compliant() {

        int result;

        try {
            result = 1;
        } finally {
            System.out.println("cleanup");
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(noncompliant());
        System.out.println(compliant());
    }
}
