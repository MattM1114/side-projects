
import java.util.Scanner;

public class Day3 {
    // for day 3 simple calculator
    public static void main(String[] args) {
        System.out.println("this is day 3");
        
        System.out.println("enter the first number: ");
        // taking input from user

        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();
        System.out.println("enter the second number: ");
        int num2 = a.nextInt();

        // performing arithmetic operations
        System.out.println("\nthe results are as follows:\n");
        System.out.println("addition:");
        System.out.println(num1 + num2 + "\n");
        System.out.println("subtraction:");
        System.out.println(num1 - num2 + "\n");
        System.out.println("multiplication:");
        System.out.println(num1 * num2 + "\n");
        System.out.println("division:");
        System.out.println(num1 / num2 + "\n");
        a.close();
    }
}