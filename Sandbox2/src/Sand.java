
public class Sand {

	public static void main(String[] args) {
		
		String str = "hellowo11rld@gmail.com";
		int len = str.length();
		int num1;
		String upper = str.toUpperCase();
		
		System.out.println(str + " is "+ len + " characters long.");
		System.out.println(str + " in all caps is: " + upper);
		
		String sub = str.substring(1,9);
		String sub2 = str.substring(6);
		String sub3 = str.substring(7,9);
		
		System.out.println(sub);
		System.out.println(sub2);
		System.out.println(sub3);
		
		System.out.println(str.charAt(6));
		
		System.out.println(str.indexOf("@"));
		
		num1 = str.indexOf("@");
		
		System.out.println(num1);

		
		if (num1 < 11) {
			System.out.println("Success");
		} else {
			System.out.println("Failure");
//			String sentence = "You must have a username shorter than \"10 characters\"";
		}

	}

}
