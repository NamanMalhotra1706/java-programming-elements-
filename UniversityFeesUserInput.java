import java.util.Scanner;

public class UniversityFeesUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the student fees: ");
        int studentFees = sc.nextInt();

        System.out.print("Enter the discount percent: ");
        int discountPercent = sc.nextInt();

        int discount = studentFees/discountPercent;
        int discountedFee = studentFees-discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}
