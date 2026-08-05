import java.util.Scanner;

public class NumberReversal {
  public static void main(String[] args) {
    int number = TakeInput();
    if (number==-1) {
      System.out.println("Error: The Number is less than zero");
    }
    else{
      System.out.println("The reversed number is: " + reverseNumber(number));
    }
  }

  private static int reversed = 0;

  public static int TakeInput() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number you want to reverse: ");
    int number = input.nextInt();
    if (number < 0) {
      input.close();
      return -1;
    }
    input.close();
    return number;
  }

  public static int reverseNumber(int number) {
    while (number != 0) {
      int digit = number % 10;
      reversed = reversed * 10 + digit;
      number = number / 10;
    }
    return reversed;
  }
}
