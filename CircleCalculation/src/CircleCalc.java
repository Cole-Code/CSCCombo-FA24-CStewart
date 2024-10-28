import java.util.Scanner;

public class CircleCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius;
		double diameter;
		double area;
		double circumference;
		
		
		System.out.println("Lets calculate circles.");
		System.out.println("Please enter the radius: ");
		
		radius = input.nextDouble();
		
		//Calculations-
		diameter = (2 * (Math.pow(radius, 2))); 
		area = (Math.PI * diameter);
		circumference = (2 * Math.PI * radius);
		
	
		//Results Output, Rounded to 2 places-
		System.out.println("For a circle with a radius of: " + radius + "-");
		System.out.println("The diameter is: " + diameter + "!");
		System.out.print("The area is: ");
		System.out.printf("%,.2f", area);
		System.out.println("!");
		System.out.print("The circumference is: ");
		System.out.printf("%,.2f", circumference);
		System.out.println("!");
		
		input.close();
	}
}




