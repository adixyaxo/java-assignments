import java.util.Scanner;
// Dum Dum digga digga ye code maine likha hai aur mera naam hai aditya
// he hahaha

public class LeapYear {

  public void leap(Scanner input){
    String ans = isLeapYear(takeYearInput(input)) ? "Yes This is a Leap Year" : "No this is not a Leap Year";
    System.out.println(ans);
  }

  public int takeYearInput(Scanner input) {
    System.out.print("Enter the year : ");
    int year = input.nextInt();
    return year;
  }

  public boolean isLeapYear(int year) {
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
      return true;
    }
    return false;
  }
}
