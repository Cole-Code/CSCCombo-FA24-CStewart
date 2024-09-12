import java.util.Scanner;

public class Sand {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x;
		
		x = input.nextInt();
		
		
		if (x % 2 == 0) {
			System.out.println("Is even.");
		} else {
			System.out.println("Is odd.");
		}
		
		if (x > 0) {
			System.out.println("Is positive.");
		} else if (x < 0) {
			System.out.println("Is negative.");
		} else {
			System.out.println("Is zero");
		}
		
		String word = input.next();
		
		if(word.length() >=8) {
			if (word.contains("!"))  {
				System.out.println("Good password!");
			}
		}
		
		if(word.length() > 8 && word.contains("!")) {
			System.out.println("GOOD!");
			
		}
		
		switch (x) {
		case 1:
			word = "one";
			break;
		case 2:
			word = "two";
			break;
		default:
			word = "Unknown";
			break;
				
		}
		
		String food = input.next();
		
		switch (food) {
		case "apple":
		case "banana":
		case "cherry":
			System.out.println("Fruit!");
			break;
		case "asparagus":
		case "carrots":
		case "peas":
			System.out.println("Vegetable!");
			break;
		default:
			System.out.println("Unknown!");
			break;
		}
		
		boolean inBetween = (x >10 ||x < 1);
		
		if(inBetween){
			System.out.println("Is between 1-10");
		}
	}

}
