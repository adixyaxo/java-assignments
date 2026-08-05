import java.util.Scanner;

public class MenuCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while () {

    }
    System.out.print("Enter the first number :: ");
    num1 = input.nextInt();
    System.out.print("Enter the second number :: ");
    num2 = input.nextInt();

  }

  public static int DisplayChoice(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your operation choice\n" +
            "    1. Add\r\n" + //
            "    2. Subtract\r\n" + //
            "    3. Multiply\r\n" + //
            "    4. Divide\r\n" + //
            "    0. Exit");
    int choice = input.nextInt();
    input.close();
    return choice;
  }

  public static float PerformOperation(float num1,float num2,int operation){
    switch (operation) {
      case 1:
        return (num1+num2);
      case 2:
        return (num1-num2);
      case 3:
        return (num1*num2);
      case 4:
        return (num1/num2);

      default:
        System.out.println("Error Occured");
        return 0;
    }

  }
}
