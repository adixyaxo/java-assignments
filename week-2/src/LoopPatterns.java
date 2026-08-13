import java.util.Scanner;

public class LoopPatterns {
  public void loop(Scanner input){
  int size = TakeInput(input);
    if (ValidateInput(size)) {
      PatternA(size);
      PatternB(size);
      PatternC(size);
      PatternD(size);
    }
    else{
      System.out.println("Error: Please enter a number above zero");
    }
  }

  public boolean ValidateInput(int size) {
    if (size > 0) {
      return true;
    }
    return false;
  }

  public int TakeInput(Scanner input) {
    System.out.print("Enter the size: ");
    int size = input.nextInt();
    return size;
  }

  public void PatternA(int size) {
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public void PatternB(int size) {
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public void PatternC(int size) {
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public void PatternD(int size) {
    for (int i = size; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public void PatternE(int size) {
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
}
