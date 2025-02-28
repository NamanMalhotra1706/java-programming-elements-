import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Students: ");
        int numberOfStudents = sc.nextInt();

        int maximumHandshakes = (numberOfStudents*(numberOfStudents-1))/2;

        System.out.println("Number of possible Handshakes: " + maximumHandshakes);
    }
}
