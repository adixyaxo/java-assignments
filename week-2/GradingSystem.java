import java.util.Scanner;
// Yah programe aditya dagar dwara likhit hai kripya isse copy krne ki koshish na kren
public class GradingSystem {
  public static void main(String[] args) {
    System.out.println(classifyMark(TakeInput()));
  }

  public static double TakeInput() {
    System.out.print("Please enter your marks :: ");
    Scanner input = new Scanner(System.in);
    double marks = input.nextDouble();
    input.close();
    return marks;
  }

  public static String classifyMark(double marks) {
    if (marks > 100) {
      return "Error Wrong input : Marks cant be more than 100 enter again";
    } else if (marks < 0) {
      return "Error Wrong input : Marks cant be less than zero enter again";
    } else if (marks >= 80) {
      return "Distinction";
    } else if (marks >= 70) {
      return "Merit";
    } else if (marks >= 50) {
      return "Pass";
    } else {
      return "Fail";
    }
  }
}