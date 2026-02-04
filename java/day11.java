
import java.util.Scanner;

public class day11 {
    // Add two numbers
    public static int add(int a, int b) {
        return a + b;
    }


    // subtract one number form another 
    public static int subtract(int a, int b) {
        return a - b;
    }

    // multiply two numbers together
    public static int multiply(int a, int b) {
        return a * b;
    }
    // divide one number by another
    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("enter the 1st number");
        int num1 = src.nextInt();
        System.out.println("enter the 2nd number");
        int num2 = src.nextInt();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("subtraction: " + subtract(num1, num2));
        System.out.println("multiplication: " + multiply(num1, num2));
        System.out.println("division: " + divide(num1, num2));

        src.close();



    }


}
