import java.util.Random;
import java.util.Scanner;

public class Nests {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int i = 0;
		int high = 45;
		int low = 5;
		int largestNum = 0;
		int largestNum2 = 0;
		//String playAgain = "Y";
		int playTimes = 0;
		
		System.out.println("How many times would you like to play?");
		playTimes = input.nextInt();
		System.out.println("Please define a range of numbers starting from low to high.");
		low = input.nextInt();
		System.out.println("Select a higher number.");
		high = input.nextInt();

//LOOPS!
		if (high - low >= 2) {
		for (i = 0; i <= playTimes; i++) {
		//while (playAgain.equals("Y")) {
		int randNum = rand.nextInt(high - low) + low;
		int randNum2 = rand.nextInt(high - low) + low;
	
		//System.out.println(randNum + " " + randNum2);
		System.out.println("Num1     Num2");
		int countTries = 1;
		int countUnequal = 1;		
		
		while (randNum != randNum2) {
			System.out.printf("%5d     %4d\n" , randNum , randNum2);
			countTries ++;
			randNum = rand.nextInt(high - low) + low;
			randNum2 = rand.nextInt(high - low) + low;
			System.out.printf("%5d     %4d\n" , randNum , randNum2);
				if(randNum != randNum2) {
				countUnequal ++;
			}
		}
		int averageNum = countUnequal / countTries;
		System.out.println("Took " + countTries + " tries!");
		System.out.println("There were " + countUnequal + " unequal pairs!");
		System.out.println("Average number of unequal pairs " + averageNum);
		//System.out.println("Would you like to play again? Type Y for Yes!");
		//System.out.println("How many times would you like to play?");
		//playTimes = input.nextInt();
			}
		}
	}
}