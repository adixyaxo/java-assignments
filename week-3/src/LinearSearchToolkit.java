import java.util.Scanner;

public class LinearSearchToolkit {

  public void LinearSearchToolkit_main(Scanner scanner){
    Display(TakeInputArray(scanner), TakeInputTarget(scanner));
  }

  public void Display(int[] values,int target){
    if (contains(values, target)) {
      System.out.println("Contains: YES");
      System.out.println("FirstIndexOf: " + firstIndexOf(values, target));
      System.out.println("LastIndexOf: " + lastIndexOf(values, target));
      System.out.println("countOccurrences: " + countOccurrences(values, target));
    }
    else{
      System.out.println("Contains: NO");
    }
  }

  public int TakeInputTarget(Scanner scanner){
    System.out.print("Enter the target value : ");
    // Written by aditya dagar hehe huhu huihuihui
    return scanner.nextInt();
  }

  public int[] TakeInputArray(Scanner scanner){
    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();
    int[] values = new int[size];
    System.out.print("Enter the values of the array: ");
    for (int i = 0; i < values.length; i++) {
      // la la li lala
      values[i] = scanner.nextInt();
    }
    return values;
  }

  public boolean contains(int[] values, int target){
    for (int i = 0; i < values.length; i++) {
      if (values[i]==target) {
        return true;
      }
    }
    return false;
  }

  public int firstIndexOf(int[] values, int target){
    for (int i = 0; i < values.length; i++) {
      if (values[i]==target) {
        // 25csu016 comment
        return i;
      }
    }
    return -1;
  }

  public int lastIndexOf(int[] values, int target){
    for (int i = values.length-1; i >-1; i++) {
      if (values[i]==target) {
        return i;
      }
    }
    return -1;
  }

  public int countOccurrences(int[] values, int target){
    int count = 0;
    for (int i = 0; i < values.length; i++) {
      if (values[i]==target) {
        count++;
      }
    }
    return count;
  }
}
