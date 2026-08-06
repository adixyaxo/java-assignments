import java.util.Scanner;

public class LoopPatterns {
  public static void main(String[] args) {
    int size = TakeInput();
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

  public static boolean ValidateInput(int size) {
    if (size > 0) {
      return true;
    }
    return false;
  }

  public static int TakeInput() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = input.nextInt();
    input.close();
    return size;
  }

  public static void PatternA(int size) {
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void PatternB(int size) {
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void PatternC(int size) {
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public static void PatternD(int size) {
    for (int i = size; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void PatternE(int size) {
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
}
