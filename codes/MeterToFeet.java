package codes;
import java.util.Scanner;

public class MeterToFeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in d meters: ");
        double meters = input.nextDouble();

        double feet = meters * 3.28084;

        System.out.println("Distance in feet: " + feet);
    }
}
