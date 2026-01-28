
import java.util.Scanner;

public class day6b {
    /*grade predictor */
    public static void main(String[] args) {
        try (Scanner scr = new Scanner(System.in)) {
            System.out.println("enter your grade as intger less 100; ");
            int grade = scr.nextInt();
            if (grade>=90){
                System.out.println("you got an A+");
            }else if (grade >=75){
                System.out.println("you got an A");
            } else if (grade >= 60) {
                System.out.println("you got a B");
            } else if (grade >= 50) {
                System.out.println("you got a C");
            } else {
                System.out.println("you failed");

            }
            scr.close();
        }
        }

}
