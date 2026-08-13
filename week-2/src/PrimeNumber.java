import java.util.Scanner;

public class PrimeNumber {

  public void prime(Scanner input) {
    String msg = isPrime(takeInput(input)) ? "Yes this is a Prime Number" : "No this is not a Prime Number";
    System.out.println(msg);
  }

  public int takeInput(Scanner input) {
    System.out.print("Enter the Number: ");
    int number = input.nextInt();
    return number;
  }

  public boolean isPrime(int number) {
    for (int i = 2; i <= number / 2; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

}
