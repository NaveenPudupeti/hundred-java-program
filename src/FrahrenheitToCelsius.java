import java.util.Scanner;

public class FrahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		float temperature;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Entered temperature in Fahrenheit");
		
		temperature = in.nextInt();
		
		temperature =((temperature - 32)*5)/9;
		
		System.out.println("Temperature in Celsius = " + temperature);
	}

}
