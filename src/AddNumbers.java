import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int x,y,z;
		
		System.out.println("Enter two integer to calciulate their sum");
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		z = x+y;
		System.out.println("Sum of entered integers ="+z);
		
	}

}
