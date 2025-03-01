import java.util.Scanner;

class TotalPrice{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Unit Price: ");
		int unitPrice = sc.nextInt();
		
		System.out.print("Enter the Quantity: ");
		int quantity = sc.nextInt();
		
		int totalPrice = unitPrice*quantity;

		System.out.print("The total purchase price is INR " + totalPrice + " if the quantity "+ quantity + " and unit price is INR " + unitPrice);
	}
}