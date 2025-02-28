import java.util.Scanner;

class DistanceInYardsAndMiles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Distance in feet: ");
        float feet = sc.nextFloat();

        float yard = feet/3;
        float miles = yard/1760;

        System.out.printf("The distance in yards is %.2f while the distance in miles is %.6f\n", yard, miles);
    }
}