import java.util.Scanner;

public class GreatestCommonDivisor {

  public void gcd(Scanner input) {

    int firstNumber = TakeInput("Enter the First Number: ",input);
    int secondNumber = TakeInput("Enter the Second Number: ",input);

    int GCD = gcd(firstNumber, secondNumber);

    System.out.println("The Greatest Common Divisor is : " + GCD);
  }

  public int TakeInput(String Message,Scanner input) {
    System.out.print(Message);
    int number = input.nextInt();
    return number;
  }

  public int gcd(int first, int second) {

    first = Math.abs(first);
    second = Math.abs(second);

    while (second != 0) {
      int remainder = first % second;
      first = second;
      second = remainder;
    }

    return first;
  }
}