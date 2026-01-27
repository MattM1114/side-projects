
import java.util.Scanner;
// we are buliding a band name generator
public class day5b {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the name of the city you grew up in ");
        String city = scr.nextLine();
        System.out.print("Enter your pet's name ");
        String pet = scr.nextLine();
        String bandName = city + " " + pet;
        System.out.println("your band band name could be " + bandName);
        scr.close();

    }

}
