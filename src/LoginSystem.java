import java.util.Scanner;

public class LoginSystem {
    private static final String VALID_USERNAME = "user123";
    private static final String VALID_PASSWORD = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            authenticateUser(username, password);
            System.out.println("Login successful!");
        } catch (IncorrectPasswordException e) {
            System.out.println("Error: Incorrect password.");
        }

        scanner.close();
    }

    public static void authenticateUser(String username, String password) throws IncorrectPasswordException {
        if (!username.equals(VALID_USERNAME) || !password.equals(VALID_PASSWORD)) {
            throw new IncorrectPasswordException();
        }
    }

    // Custom exception class for incorrect password
    static class IncorrectPasswordException extends Exception {
        IncorrectPasswordException() {
            super("Incorrect password");
        }
    }
}