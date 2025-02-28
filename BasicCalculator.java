import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float number1 = sc.nextFloat();

        System.out.println("Enter the second number: ");
        float number2 = sc.nextFloat();

        if (number2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
                + number1 + " and " + number2 + " is " 
                + (number1 + number2) + ", " 
                + (number1 - number2) + ", " 
                + (number1 * number2) + ", and " 
                + (number1 / number2) + " resp.");
        }
        
        sc.close();
    }
}
