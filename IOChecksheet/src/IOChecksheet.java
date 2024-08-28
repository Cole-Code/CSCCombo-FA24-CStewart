import java.util.Scanner;

public class IOChecksheet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String word;
		int intNum;
		float realNum;
		double biggerRealNum;
		char letter;

		/*
		//word
		System.out.println("Enter multiple words");
		word = input.nextLine();
		
		System.out.println("Here is the sentence: " + word);
		
		//intNum
		System.out.println("Enter a number");
		intNum = input.nextInt();
		
		System.out.println("Here is your number: " + intNum);
		
		//realNum
		System.out.println("Enter a real number");
		realNum = input.nextFloat();
		
		System.out.println("Here is your real number: " + realNum);
		
		//biggerRealNum
		System.out.println("Enter a bigger number");
		biggerRealNum = input.nextDouble();
		
		//System.out.println("Here is your bigger number: " + biggerRealNum);
		System.out.printf("Here is the bigger number: $%.2f", biggerRealNum);
		
		
		//letter
		System.out.println("\nEnter a character");
		letter = input.next().charAt(0);
		System.out.println("Here is your character: " + letter);
		*/
		
		//float adder
		realNum = 987654321.987654321f;
		realNum = realNum + realNum;
		System.out.println(realNum);
		
		//double adder
		biggerRealNum = 987654321.987654321;
		biggerRealNum = biggerRealNum + biggerRealNum;
		System.out.println(biggerRealNum);
		
		
				
	}

}
