import java.util.Scanner;

public class TempratureConversion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the Temprature in celsius :: ");
    double celsius = input.nextDouble();
    double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
    System.out.print("Temprature in fahrenheit is :: "+fahrenheit + " F");

    input.close();
  }
}
