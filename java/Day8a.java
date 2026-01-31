
import java.util.Scanner;

public class Day8a {
    public static void main(String[] args) {

        Scanner scr =new Scanner(System.in);
        // the frist part of the program counts to 10 from 1 and prints it 
        // the part take user input and builds the  mutiplcation table of that number

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.print("Enter a number: ");
        int num = scr.nextInt();
        // this part gets input from the user
        for (int j = 0; j <= 10; j++) {
            System.out.println("\n"+num +" X "+ j +" = "+(num*j));
        }

    }

}
