import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int x, y,z;
		System.out.println("Enter three integers");
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		if (x>y && x>z)
			System.out.println("First number is largest.");
		
		else if (y>z && y>x)
			System.out.println("Second number is largest.");
		else if (z>x && z>y)
			System.out.println("Third number is largest.");
		else
			System.out.println("Entered number are not distinct.");
	}

}
