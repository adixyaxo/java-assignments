import java.util.Scanner;

public class DigitExtraction {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a three digit number :: ");
    int number = input.nextInt();
    if (number<100 | number>999) {
      System.out.print("The number is not a three digit number");
    }
    else{
      System.out.println("Hundreds : " + ((number%1000 - number%100)/100));
      System.out.println("Tens : " + ((number%100 - number%10)/10));
      System.out.println("Units : " + (number%10));
    }
    input.close();
  }
}
