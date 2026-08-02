import java.util.Scanner;

public class ArthematicCalculator {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Arithmetic Calculator");

    System.out.print("Enter first number: ");
    int a = input.nextInt();

    System.out.print("Enter second number: ");
    int b = input.nextInt();


    System.out.println("sum = " + (a + b));
    System.out.println("difference = " + (a - b));
    System.out.println("product = " + (a * b));
    System.out.println("quotient = " + (a / b));
    System.out.println("remainder = " + (a % b));

    input.close();
  }

}
