import java.util.Scanner;

public class NumberAnalyzer {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = readNumber(input);
    boolean is_positive = isPositive(number);
    int absValue = absoluteValue(number);
    boolean is_even = isEven(absValue);
    int count = countDigits(absValue);
    int sum = sumDigits(absValue);
    printReport(number, is_even, is_positive, count, sum);
    input.close();
  }

  static int readNumber(Scanner input) {
    System.out.print("Enter the Number: ");
    int number = input.nextInt();
    return number;
  }

  static boolean isEven(int number) {
    if (number % 2 == 0) {
      return true;
    }
    return false;
  }

  static boolean isPositive(int number) {
    if (number >= 0) {
      return true;
    }
    return false;
  }

  static int absoluteValue(int number) {
    return Math.abs(number);
  }

  static int countDigits(int number) {
    int count = 0;
    while (number > 0) {
      number = number / 10;
      count++;
    }
    return count;
  }

  static int sumDigits(int number) {
    int sum = 0;
    while (number > 0) {
      int digit = number % 10;
      sum = sum + digit;
      number = number / 10;
    }
    return sum;
  }

  static void printReport(
      int number,
      boolean even,
      boolean positive,
      int digitCount,
      int digitSum) {
    System.out.println("Number: " + number);
    if (even) {
      System.out.println("Even: Yes, This is an even number");
    } else {
      System.out.println("Even: No, This is an Odd number");
    }
    if (positive) {
      System.out.println("Positive: Yes, This is an Positive number");
    } else {
      System.out.println("Positive: No, This is an Negetive number");
    }
    System.out.println("Number of Digits in the number: " + digitCount);
    System.out.println("Sum of Digits of the number: "+digitSum);
  }
}
