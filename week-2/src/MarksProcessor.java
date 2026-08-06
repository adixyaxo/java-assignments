import java.util.Scanner;

public class MarksProcessor {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome of Marks Processor\nEnter the Marks one by one now");
    double mark = 0;
    while (ExitChecker(mark)) {
      mark = ReadMarks(input);
      if (MarksValid(mark)) {
        noOfValidMarks = noOfValidMarks + 1;
        MarksSum(mark);
        PassFail(mark);
        HighestMarks(mark);
      }
    }
    Display();
    input.close();
  }

  private static int noOfValidMarks = 0;
  private static double sumMarks = 0;
  private static double highestMarks = 0;
  private static int noOfPasses = 0;
  private static int noOfFailure = 0;

  public static boolean ExitChecker(double mark) {
    if (mark == -1) {
      System.out.println("Exiting Program");
      return false;
    }
    return true;
  }

  public static double ReadMarks(Scanner input) {
    System.out.print("Enter the Mark: ");
    double mark = input.nextDouble();
    return mark;
  }

  public static boolean MarksValid(double mark) {
    if (mark >= 0 & mark <= 100) {
      return true;
    }
    return false;
  }

  public static void MarksSum(double mark) {
    sumMarks = sumMarks + mark;
  }

  public static void PassFail(double mark) {
    if (mark >= 50) {
      noOfPasses = noOfPasses + 1;
    } else {
      noOfFailure = noOfFailure + 1;
    }
  }

  public static void HighestMarks(double mark) {
    if (mark > highestMarks) {
      highestMarks = mark;
    }
  }

  public static double averageMarks(){
    if (noOfValidMarks == 0) {
      return 0;
    }
    return sumMarks/noOfValidMarks;
  }

  public static void Display() {
    System.out.println("- number of valid marks entered: " + noOfValidMarks + "\n" +
        "- sum of the marks: " + sumMarks + "\n" +
        "- average mark: " + averageMarks() + "\n" +
        "- highest mark: " + highestMarks + "\n" +
        "- number of passes (mark >= 50): " + noOfPasses + "\n" +
        "- number of failures (mark < 50): " + noOfFailure + "\n" );
  }

}
