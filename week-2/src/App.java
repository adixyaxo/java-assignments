import java.util.Scanner;
public class App {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    MenuCalculator CALCULATE = new MenuCalculator();
    CALCULATE.Calculate(input);

    LeapYear LEAP = new LeapYear();
    LEAP.leap(input);

    PrimeNumber PRIME = new PrimeNumber();
    PRIME.prime(input);

    LoopPatterns LOOP = new LoopPatterns();
    LOOP.loop(input);

    GradingSystem GRADING = new GradingSystem();
    GRADING.grading(input);

    GreatestCommonDivisor GCD = new GreatestCommonDivisor();
    GCD.gcd(input);

    MarksProcessor MP = new MarksProcessor();
    MP.mp(input);

    NumberAnalyzer NA = new NumberAnalyzer();
    NA.na(input);

    NumberReversal NR = new NumberReversal();
    NR.nr(input);

    input.close();
  }
}
