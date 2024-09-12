import java.util.Scanner;

public class IfAndScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int high = 0;
		int med = 0;
		int low = 0;
		String str1;
		String str2;
		
		System.out.println("Please input a number!");
		num1 = input.nextInt();
		System.out.println("Please input another value!");
		num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println("Your first value was higher at: " + num1);
		} else if (num1 < num2) {
			System.out.println("Your second value was higher at: " + num2);
		} else {
			System.out.println("Your inputs were the same!");
		}
		
		System.out.println("Input a final value!");
		num3 = input.nextInt();
		
		if(num1 > num2 && num1 > num3) high = num1;
		if(num1 < num2 && num2 > num3) high = num2;
		if(num1 < num3 && num2 < num3) high = num3;
		if(num1 < num2 && num1 < num3) low = num1;
		if(num1 > num2 && num2 < num3) low = num2;
		if(num1 > num3 && num2 > num3) low = num3;
		if(num1 > low && num1 < high) med = num1;
		if(num2 > low && num2 < high) med = num2;
		if(num3 > low && num3 < high) med = num3;
		System.out.println("In descending order your values were: " + high + ", " + med + ", " + low);
		
		System.out.println("Please input two strings!");
		
		str1 = input.next();
		str2 = input.next();
		
		if (str1.compareTo(str2) < 0) {
			System.out.println("String 1 wins.");
		} else {
			System.out.println("String 2 wins.");
		}
		
		if (str1.equals(str2)) {
			System.out.println("Strings are equal.");
		} else {
			System.out.println("Strings are not equal.");
		}
		
		if (!(str1.equals(str2))) {
			System.out.println("Strings are not equal!!");
		} else {
			System.out.println("Strings are equal.");
		}
	
	}

}

/*	if (num1 > num2 && num1 > num3) 
if (num2 > num3){
high = num1;
med = num2;
low = num3;
} else if (num1 > num2 && num1 > num3) 
if (num2 < num3){
	high = num1;
	med = num3;
	low = num2;
}
else if (num1 < num2 && num2 > num3)
if (num3 > num1) {
high = num2;
med = num3;
low = num1;
} else if (num1 < num2 && num2 > num3)
	if (num3 < num1) {
	high = num2;
	med = num1;
	low = num3;
} */
