/*
Rule: THI05-J
Do not use Thread.stop()
*/

public class R10_THI05_J {

    public static void noncompliant() {

        Thread t = new Thread(() -> {

            while(true) {
                System.out.println("running");
            }

        });

        t.start();
        t.stop();

    }

    public static void compliant() {

        Thread t = new Thread(() -> {

            while(!Thread.currentThread().isInterrupted()) {
                System.out.println("running");
            }

        });

        t.start();
        t.interrupt();

    }

}
