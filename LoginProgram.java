package loginpage;

import java.util.Scanner;

public class LoginProgram {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            final int MAX_TRIES = 3;
            String correctUsername = "M32";
            String correctPassword = "DIAS32";
            
            for (int tries = 1; tries <= MAX_TRIES; tries++) {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                
                if (username.equals(correctUsername) && password.equals(correctPassword)) {
                    System.out.println("Login successful! Welcome, " + username);
                    break;
                } else {
                    System.out.println("Login failed. Please try again. Remaining tries: " + (MAX_TRIES - tries));
                }
            }
        }
    }
}

