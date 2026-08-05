import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
  String msg = isPrime(takeInput())? "Yes this is a Prime Number":"No this is not a Prime Number";
  System.out.println(msg);
  }

  public static int takeInput(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int number = input.nextInt();
    input.close();
    return number;
  }

  public static boolean isPrime(int number){
    for (int i = 2; i <= number/2; i++) {
      if (number%i==0) {
        return false;
      }
    }
    return true;
  }

}
