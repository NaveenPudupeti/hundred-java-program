import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,d;
		
		System.out.println("Enter range of number to print their mutiplication tables");
		
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		b=in.nextInt();
		
		for ( c=a; c<=b;c++) {
			System.out.println("Multiplication table of "+c);
			
			for ( d=1; d<=10; d++) {
				System.out.println(c+""+d+"="+(c*d));
			}
		}
			
	}

}
