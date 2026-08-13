import java.util.Scanner;

public class MarksProcessor {

    public int noOfValidMarks = 0;
    public double sumMarks = 0;
    public double highestMarks = 0;
    public int noOfPasses = 0;
    public int noOfFailure = 0;

    public void mp(Scanner input) {
        System.out.println("Welcome to Marks Processor");
        System.out.println("Enter the marks one by one.");
        System.out.println("Enter -1 to exit.");

        while (true) {
            double mark = ReadMarks(input);

            if (mark == -1) {
                System.out.println("Exiting Program");
                break;
            }

            if (MarksValid(mark)) {
                noOfValidMarks++;
                MarksSum(mark);
                PassFail(mark);
                HighestMarks(mark);
            } else {
                System.out.println("Invalid mark. Enter a mark between 0 and 100.");
            }
        }

        Display();
    }

    public double ReadMarks(Scanner input) {
        System.out.print("Enter the Mark: ");
        return input.nextDouble();
    }

    public boolean MarksValid(double mark) {
        return mark >= 0 && mark <= 100;
    }

    public void MarksSum(double mark) {
        sumMarks += mark;
    }

    public void PassFail(double mark) {
        if (mark >= 50) {
            noOfPasses++;
        } else {
            noOfFailure++;
        }
    }

    public void HighestMarks(double mark) {
        if (mark > highestMarks) {
            highestMarks = mark;
        }
    }

    public double averageMarks() {
        if (noOfValidMarks == 0) {
            return 0;
        }

        return sumMarks / noOfValidMarks;
    }

    public void Display() {
        System.out.println(
            "- Number of valid marks entered: " + noOfValidMarks + "\n" +
            "- Sum of the marks: " + sumMarks + "\n" +
            "- Average mark: " + averageMarks() + "\n" +
            "- Highest mark: " + highestMarks + "\n" +
            "- Number of passes (mark >= 50): " + noOfPasses + "\n" +
            "- Number of failures (mark < 50): " + noOfFailure
        );
    }
}