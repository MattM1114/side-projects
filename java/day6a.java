
import java.util.Scanner;

public class day6a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your age; ");
        int age = sc.nextInt();
        if (age < 13) {
            System.out.println("you are a child");
        } else if (age < 18) {
            System.out.println("your are a teenager");
        } else {
            System.out.println("your are an adult and you are allowed to play GTA");

        }
        sc.close();
        }
}




