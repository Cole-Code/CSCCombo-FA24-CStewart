import java.util.Random;
import java.util.Scanner;

public class Roll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rndm = new Random();
		
		int i = 0;
		int rolls = 10;
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		int p1Score = 0;
		int p2Score = 0;
		int p3Score = 0;
		
		
		
		System.out.println("P1 input a number 1-6:");
		p1 = input.nextInt();
		System.out.println("P2 input a number 1-6:");
		p2 = input.nextInt();
		System.out.println("P3 input a number 1-6:");
		p3 = input.nextInt();
		
		if(p1 <= 6 && p2 <= 6 && p3 <= 6) {
			for (i = 0; i < rolls; i++) {
			
			}
		}

	}

}
