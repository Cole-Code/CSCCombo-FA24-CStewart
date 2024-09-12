import java.util.Scanner;

public class Sand {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int num;
		
		System.out.println("Please enter your grade");
		num = scnr.nextInt();
						
				
		if(num > 0)System.out.println("test taken");
		if(num > 90)System.out.println("A");
		else if(num > 80)System.out.println("B");
		else if(num > 70)System.out.println("C");
		else if(num >= 60 && num < 70)System.out.println("D");
		else System.out.println("F");
		
		String str = "Hello";
		String str2 = "Hell!o";
		
		if (str.equals(str)) {
			System.out.println("Words are the same");
		}
		else{
			System.out.println("Words are not the same");
		}
		int result = str.compareTo(str2);
		if(result > 0) {
			System.out.println(str2 + ", " + str);
		}
		else if (result == 0) {
			System.out.println("Yuh same words!");
		}
		else {
			System.out.println(str + ", " + str2);
		}

	}

}
