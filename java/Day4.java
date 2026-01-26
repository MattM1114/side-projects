import java.util.Scanner;

public class Day4 {
    public static void main(String[] args){
        // we are creating an object of Scanner class to take input from user
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scr.nextLine();
        System.out.print("Enter your age: ");
        String age = scr.nextLine();
        System.out.print("Enter your course: ");
        String course = scr.nextLine();
        System.out.print("Enter your Marks as a precentage: ");
        float marks = scr.nextFloat();

        System.out.println("Hello " + name + ", you are " + age + " years old and you are enrolled in the " + course + " course.");
        System.out.println("Your marks are: " + marks + "%");
        scr.close();
    }
}
