
import java.util.Scanner;

public class day7a {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scr.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is Even.");

        }
        else {
            System.out.println("The number is Odd");
        }
        scr.close();

    }
}

