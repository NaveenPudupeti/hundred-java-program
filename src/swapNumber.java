import java.util.Scanner;

public class swapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		int x,y,temp;
		System.out.println("Enter X and Y");
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		
		y = in.nextInt();
		
		System.out.println("Before Swapping\nx = "+x+"\ny= "+y);
		
		
		temp = x;
		
		x= y;
		y = temp;
		
		System.out.println("After Swapping\nx = "+x+"\ny = "+y);
	}

}
