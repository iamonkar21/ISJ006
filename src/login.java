import java.util.Scanner;

public class login {

    private static final String correctUsername = "user";
    private static final String correctPassword = "password";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = input.nextLine();

        System.out.println("Enter password: ");
        String password = input.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed: invalid username or password");
        }

        input.close();
    }
}