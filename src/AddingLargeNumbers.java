import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers {

	public static void main(String[] args) {
	
         
		String number1,number2;
		
		Scanner in = new Scanner(System.in);
		
		


		number1 = in.nextLine();
		
		System.out.println("Entered second large number");
		number2 = in.nextLine();
		
		BigInteger first = new BigInteger(number1);     //BigInterger is Immutable java primitive data type
		BigInteger second = new BigInteger(number2);
		BigInteger sum;
		
		sum = first.add(second);
		
		System.out.println("Result of Addition="+sum);
		
	}

}
