
import java.util.*;

public class Sand {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String args[]) {
    int numOne = 25;
    int numTwo = 50;
    int numThree = 100;
    int High = 0;
    int Med = 0;
    int Low = 0;
    System.out.print("Please enter a number");
    numOne = scanner.nextInt();
    System.out.print("Please enter a different number: ");
    numTwo = scanner.nextInt();
    System.out.print("Please enter a third number: ");
    numThree = scanner.nextInt();
    System.out.println("Your numbers were: " + numOne + ", " + numTwo + ", " + numThree + "!");
    if (numOne > numTwo) {
      System.out.println("Your first number was larger than the second!");
      if (numOne > numThree) {
        System.out.println("Number one was larger than all other inputs!");
        High = numOne;
        Med = numThree;
        Low = numTwo;
      } else {
        System.out.println("However, number three was the largest!");
        High = numThree;
        Med = numOne;
        Low = numTwo;
      }
    } else {
      System.out.println("Your second number was larger than the first!");
      if (numTwo > numThree) {
        System.out.println("Your second number was the largest!");
        High = numTwo;
        Med = numThree;
        Low = numOne;
      } else {
        System.out.println("Your third number was the largest!");
        High = numThree;
        Med = numTwo;
        Low = numOne;
      }
    }
    System.out.println("Your numbers in order: " + High + ", " + Med + ", " + Low);
  }
}