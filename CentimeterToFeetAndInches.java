import java.util.Scanner;

class CentimeterToFeetAndInches{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Height in centimeter: ");
        double centimeter = sc.nextDouble();

        double inches = centimeter/2.54;
        double foot = inches*12;

        System.out.println("Your Height in cm is " + centimeter + " while in feet is " + foot +" and in inches is " + inches);
    }
}