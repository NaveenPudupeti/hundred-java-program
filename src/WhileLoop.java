import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer");
		
		while ((n = input.nextInt()) !=0) {
			
			System.out.println("You enter"+n);
			System.out.println("Input an integer");
			
			
		}
		
		System.out.println("out of loop");
	}

}
