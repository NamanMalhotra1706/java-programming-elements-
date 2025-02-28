import java.util.Scanner;

public class KilometerToMilesUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in Km: ");
        double var1 = sc.nextDouble();

        System.out.println("The distance " + var1 + " km in miles is " + var1 / 1.6);
    }
}
