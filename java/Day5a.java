
import java.util.Scanner;



public class Day5a {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.print("enter your name ");
        String name = scr.nextLine();
        System.out.println("Oringinal " + name);
        System.out.println("Uppercase " + name.toUpperCase());
        System.out.println("Lowecase " + name.toLowerCase());
        System.out.println("length " + name.length());
        
        scr.close();
    }


}
