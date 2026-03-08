/*
Rule: IDS03-J
Do not log unsanitized user input
SEI CERT Oracle Coding Standard for Java
*/

public class R00_IDS03_J {

    // Noncompliant code
    public static void noncompliant(String username) {
        System.out.println("Login failed for user: " + username);
    }

    // Compliant code
    public static void compliant(String username) {
        String sanitized = username.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Login failed for user: " + sanitized);
    }

    public static void main(String[] args) {
        noncompliant("admin<script>");
        compliant("admin<script>");
    }
}
