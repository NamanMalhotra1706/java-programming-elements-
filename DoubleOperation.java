import java.util.Scanner;

class DoubleOperation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		double a = sc.nextDouble();
		
		System.out.print("Enter the number : ");
		double b = sc.nextDouble();
		
		System.out.print("Enter the number : ");
		double c = sc.nextDouble();
		
		double operation1 = (a+b)*c;
		double operation2 = (a*b)+c;
		double operation3 = (c+a)/b;
		double operation4 = (a%b)+c;
		
		System.out.print("The results of Operations are " + operation1 +", " + operation2 +", " + operation3 +", and " + operation4); 
	}
}