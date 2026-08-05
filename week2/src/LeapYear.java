import java.util.Scanner;
// Dum Dum digga digga ye code maine likha hai aur mera naam hai aditya
// he hahaha

public class LeapYear {
  public static void main(String[] args) {
    String ans = isLeapYear(takeYearInput()) ? "Yes This is a Leap Year" : "No this is not a Leap Year";
    System.out.println(ans);
  }

  public static int takeYearInput() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the year : ");
    int year = input.nextInt();
    input.close();
    return year;
  }

  public static boolean isLeapYear(int year) {
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
      return true;
    }
    return false;
  }
}
