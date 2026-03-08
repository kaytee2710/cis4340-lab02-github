/*
Rule: LCK09-J
Do not perform blocking operations while holding a lock
*/

public class R11_LCK09_J {

    private static final Object lock = new Object();

    public static void noncompliant() {

        synchronized(lock) {

            try {
                Thread.sleep(3000);
            } catch(Exception e){}

        }

    }

    public static void compliant() {

        try {
            Thread.sleep(3000);
        } catch(Exception e){}

        synchronized(lock) {

            System.out.println("safe");

        }

    }

}
