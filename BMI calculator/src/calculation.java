import java.util.Scanner;
public class calculation {
	
	void calcu(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your height in meter:");
		double height = sc.nextDouble();
		
		System.out.println("Enter your weight in kg:");
		double weight = sc.nextDouble();
		
		double bmi = weight/(height*height);
		
		System.out.println("Your BMI is %.2f "+ String.format("%.2f", bmi));
	}
	

}
