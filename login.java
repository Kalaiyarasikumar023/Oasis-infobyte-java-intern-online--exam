import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Authentication {
    private Map<String, String> users;

    public Authentication() {
        this.users = new HashMap<>();
        // You can add predefined users and their passwords here
        users.put("user1", "password1");
        users.put("user2", "password2");
    }

    public boolean authenticate(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Authentication authentication = new Authentication();

        System.out.println("Welcome to the Online Exam System");

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (authentication.authenticate(username, password)) {
            System.out.println("Login successful!");
            // Continue to the next section (e.g., view questions)
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }
    }
}
