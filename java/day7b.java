
import java.util.Scanner;

public class day7b {
    public static void main(String[] args) {
        int secret = (int) (Math.random() * 10) + 1;
        System.out.println("Guess a number between 1 and 10: ");
        Scanner scr = new Scanner(System.in);
        int guess = scr.nextInt();
        if (guess == secret) {
            System.out.println("You guessed the correct number!");
            System.out.println(secret + " is the right");
        } else {
            System.out.println("Sorry, you didn't guess correctly.");
            System.out.println(secret + " was the right answer.");

        }
        scr.close();
        

    }
}
