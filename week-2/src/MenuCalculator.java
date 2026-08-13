import java.util.Scanner;

public class MenuCalculator {

  public void Calculate(Scanner input) {
    while (true) {
      DisplayChoice();
      int choice = ChooseOperation(input);
      if (!ValidateOperationChoice(choice)) {
        System.out.println("Error: You Entered Wrong Choice");
        break;
      } else if (choice == 0) {
        System.out.println("Exiting Calculator");
        break;
      } else {
        System.out.print("Enter the First Number: ");
        float num1 = input.nextInt();
        System.out.print("Enter the Second Number: ");
        float num2 = input.nextInt();
        float output = PerformOperation(num1, num2, choice);
        System.out.println(output);
      }
    }
  }

  public void DisplayChoice() {
    System.out.println("Enter your operation choice\n" +
        "    1. Add\r\n" +
        "    2. Subtract\r\n" +
        "    3. Multiply\r\n" +
        "    4. Divide\r\n" +
        "    0. Exit");
  }

  public int ChooseOperation(Scanner input) {
    int choice = input.nextInt();
    return choice;
  }

  public boolean ValidateOperationChoice(int choice) {
    if (choice >= 0 && choice < 5) {
      return true;
    }
    return false;
  }

  public float PerformOperation(float num1, float num2, int operation) {
    switch (operation) {
      case 1:
        return (num1 + num2);
      case 2:
        return (num1 - num2);
      case 3:
        return (num1 * num2);
      case 4:
        return (num1 / num2);

      default:
        System.out.println("Error Occured");
        return 0;
    }

  }
}
