import java.util.Scanner;
import java.time.*;

class HarrisAge{
	public static void main(String[] args){
			
			int birthYear = 2000;
			System.out.print("Harry Age: " + (Year.now().getValue()-birthYear));
	}
}