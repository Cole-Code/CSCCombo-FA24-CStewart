//Cole Stewart Final
import java.util.Scanner;

public class BasicOption {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("----Hello user----");		
		System.out.println("Please input a low number");
		int lowNum = input.nextInt();
		System.out.println("Your low is: " + lowNum + ", now enter a higher number.");
		int highNum = input.nextInt();
		System.out.println("Your high number is: " + highNum + ".");
		//Create a FINAL for constant number of input
		
		
		lowToHigh(lowNum, highNum);
		System.out.println();

		
		System.out.println("----Next Block----");		
		System.out.println("\n" + "Input two different numbers, order doesn't matter.");
		int num1 = input.nextInt(); System.out.println("Input Received");
		int num2 = input.nextInt(); System.out.println("Input Received");
		
		if (num1 >= num2) {
			highNum = num1;
			lowNum = num2;
		} else if (num1 < num2) {
			highNum = num2;
			lowNum = num1;
		}
		
		lowToHigh(lowNum, highNum);
		System.out.println("----Next Block----");		
		System.out.println();
		
		int keyPressed = 10;
		while (true) {
			if (keyPressed >= 0) {
				System.out.println("Input a number! **non-negative**");
				num1 = input.nextInt();
				System.out.println("Input a second number! **non-negative**");
				num2 = input.nextInt();
				
				if (num1 >= num2) {
					highNum = num1;
					lowNum = num2;
				} else if (num1 < num2) {
					highNum = num2;
					lowNum = num1;
				}
				
				lowToHigh(lowNum, highNum);
				System.out.println();
			System.out.println("Enter -1 to proceed to next block, else continue.");
			keyPressed = input.nextInt();
			} else {
				break;
			}

		}
		
		System.out.println("Loop Closed: Input a new number!");
		num1 = input.nextInt(); System.out.println("Input Received");
		System.out.println("Input a second number!");
		num2 = input.nextInt(); System.out.println("Input Received" + "\n");
		System.out.println("For high to low enter a negative, for low to high enter a positive.");
		int choice = input.nextInt();

		if (choice >= 0) {
			if (num1 >= num2) {
				highNum = num1;
				lowNum = num2;
			} else if (num1 < num2) {
				highNum = num2;
				lowNum = num1;
			}
			lowToHigh(lowNum, highNum);	
		} else if (choice < 0) {
			if (num1 >= num2) {
				highNum = num1;
				lowNum = num2;
			} else if (num1 < num2) {
				highNum = num2;
				lowNum = num1;
			highToLow(lowNum, highNum);

			}
		}
		input.close();
	}
		
	
	public static void lowToHigh(int low, int high) {
		int difference = high - low;
		int countUp = 0;
		System.out.println("Counting up from the integer after low, until high!");
		for (int i = 1; i <= difference - 1; i++) {
			countUp = low + i;
			System.out.println(countUp);
		}
		if (high % 10 == 0) {
			System.out.println("Larger num divisible by 10");
		}
		//return countUp;
	}
	
	public static void highToLow(int low, int high) {
		int difference = high - low;
		int countDown = 0;
		System.out.println("Counting down from the integer before high, until low!");
		for (int i = 1; i <= difference; i++) {
			countDown = high - i;
			System.out.println(countDown);
			
		}
		if (high % 10 == 0) {
			System.out.println("Larger num divisible by 10");
		}
		//return countDown;
	}
	
}
