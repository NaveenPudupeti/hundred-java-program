import java.util.Scanner;

public class usingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a;
          float b;
          String s;
          
          Scanner in = new Scanner(System.in);
          
          
          System.out.println("Enter a String");
          s=in.nextLine();
          System.out.println("You entered string"+s);
          
          System.out.println("Enter an integer");
          a=in.nextInt();
          System.out.println("You entered integer"+a);
          
          System.out.println("Entered a float");
          b=in.nextFloat();
          System.out.println("you entered float"+b);
          
          System.out.println(s+""+a+""+b);
	}

}
