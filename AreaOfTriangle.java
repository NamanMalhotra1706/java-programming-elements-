import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the height of triangle in cm: ");
        double hieght = sc.nextInt();

        System.out.print("Enter the base of triangle in cm: ");
        double base = sc.nextInt();

        double AreaOfTriangle = 0.5*hieght*base;
        double AreaOfTriangleInSqInch = AreaOfTriangle/(2.54*2.54);

        System.out.println("The Area of the triangle in sq in is "+ AreaOfTriangleInSqInch +" and sq cm is " + AreaOfTriangle );
    }
}
