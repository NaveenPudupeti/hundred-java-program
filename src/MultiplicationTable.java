import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
 
		int n, c;
		System.out.println("Enter an interger to print it's a multiplication  table");
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		System.out.println("Multiplication table of "+n+"is :-");
		
		for(c=1; c<=10;c++)
			System.out.println(n+"*"+c+"="+(n*c));
	
	
	//practices
		
		System.out.println("Practices :-");
		
		int i,j;
		System.out.println("Enter an integer to print it's multiplication table");
		
		//Scanner on = new Scanner(System.in);
		
		i = in.nextInt();
		
		System.out.println("Mutiplication table of "+i+" is :-");
		
		for ( j=1; j<=10; j++);
		
		System.out.println(i+"*"+j+"="+(i*j));
		
	
	
	
	}

}
