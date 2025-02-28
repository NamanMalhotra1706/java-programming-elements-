public class UniversityFees {
    public static void main(String[] args) {
        int studentFees = 125000;
        int discountPercent = 10;
        int discount = 125000/10;
        int discountedFee = studentFees-discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);

    }
}
