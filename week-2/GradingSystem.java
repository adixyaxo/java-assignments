import java.util.Scanner;
// Yah programe aditya dagar dwara likhit hai kripya isse copy krne ki koshish na kren
public class GradingSystem {
  public static void main(String[] args) {
    Display(TakeInput());
  }

  public static double TakeInput() {
    System.out.print("Please enter your marks :: ");
    Scanner input = new Scanner(System.in);
    double marks = input.nextDouble();
    input.close();
    return marks;
  }

  public static void Display(double marks) {
    if (marks > 100) {
      System.out.println("Error Wrong input : Marks cant be more than 100 enter again");
    } else if (marks < 0) {
      System.out.println("Error Wrong input : Marks cant be less than zero enter again");
    } else if (marks >= 80) {
      System.out.println("Distinction");
    } else if (marks >= 70) {
      System.out.println("Merit");
    } else if (marks >= 50) {
      System.out.println("Pass");
    } else {
      System.out.println("Fail");
    }
  }
}