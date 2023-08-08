
package SRP;

public class Main {
    public static void main(String[] args) {
        StudentMailHandler upHandler = new UsernamePasswordAuthentication();
        StudentMailHandler ipHandler = new IPCheck();

        ipHandler.setNextHandler(upHandler);

        boolean isAuthenticated = ipHandler.authenticate("admin", "admin123");
        if (isAuthenticated) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
}
