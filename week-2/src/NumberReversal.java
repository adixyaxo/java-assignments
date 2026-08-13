import java.util.Scanner;

public class NumberReversal {
  public void nr(Scanner input) {
    int number = TakeInput(input);
    if (number==-1) {
      System.out.println("Error: The Number is less than zero");
    }
    else{
      System.out.println("The reversed number is: " + reverseNumber(number));
    }
  }

  private int reversed = 0;

  public int TakeInput(Scanner input) {
    System.out.print("Enter the number you want to reverse: ");
    int number = input.nextInt();
    if (number < 0) {
      input.close();
      return -1;
    }
    return number;
  }

  public int reverseNumber(int number) {
    while (number != 0) {
      int digit = number % 10;
      reversed = reversed * 10 + digit;
      number = number / 10;
    }
    return reversed;
  }
}
