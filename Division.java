import java.util.Scanner;

class Division{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Divisor: ");
		int divisor = sc.nextInt();
		
		System.out.print("Enter the Divident: ");
		int divident = sc.nextInt();
		
		int quotient = divident/divisor;
		int reminder = divident%divisor;
		
		System.out.print("The Quotient is " + quotient +" and reminder is " + reminder + " of two number " + divident + " and " + divisor );
	}
}