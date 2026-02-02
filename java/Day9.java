import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        String correct = "Java123";
        int attempts = 5;
        boolean loggedIn = false;

        while (attempts > 0 && !loggedIn) {
            System.out.println("Enter your password");
            String input = src.nextLine();

            if (input.equals(correct)) {
                loggedIn = true;
                System.out.println("You are logged in!");

            } else {
                attempts--;
                System.err.println("wrong password, you have " + attempts + " attempts left.");
            }
        }
        if (!loggedIn) {
            System.out.println("you have no more attempts. the account has been locked");
        }
    }
}