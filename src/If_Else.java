import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int marksObtained,passingMarks;
		
		passingMarks = 40;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input marks scored by you");
		
		marksObtained = input.nextInt();
		
		if (marksObtained >= passingMarks) {
			System.out.println("You passed the exam.");
			
		}
		
		else {
			System.out.println("Unfortunately you failled to pass the exam.");
			
		}
	}

}
