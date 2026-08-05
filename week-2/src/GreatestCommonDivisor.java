import java.util.Scanner;

public class GreatestCommonDivisor {

  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    int firstNumber = TakeInput("Enter the First Number: ");
    int secondNumber = TakeInput("Enter the Second Number: ");

    int GCD = gcd(firstNumber, secondNumber);

    System.out.println("The Greatest Common Divisor is : " + GCD);

    input.close();
  }

  public static int TakeInput(String Message) {
    System.out.print(Message);
    int number = input.nextInt();
    return number;
  }

  public static int gcd(int first, int second) {

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