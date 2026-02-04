
import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double avg = (double) total / n;

        System.out.println("total marks: " + total);
        System.out.println("average mark: " + avg);
        sc.close();
    }
}
