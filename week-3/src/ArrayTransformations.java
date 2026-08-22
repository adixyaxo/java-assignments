import java.util.Scanner;

public class ArrayTransformations {

  public void ArrayTransformations_main(Scanner scanner){

  }

  public int arrayInputLength(Scanner scanner){
    System.out.print("Enter the length of the array: ");
    int length = scanner.nextInt();
    return length;
  }

  public int[] takeArrayInput(Scanner scanner,int length){
    int[] array = new int[length];
    System.out.println("Enter the values of the array: ");
    for (int i = 0; i < length; i++) {
      array[i] = scanner.nextInt();
    }
    return array;
  }

  public void reverseInPlace(int[] values){
    int arrayLength = values.length;
    for (int i = 0; i < arrayLength / 2 ; i++) {
      int temp;
      temp = values[i];
      values[i] = values[arrayLength - i - 1];
      values[arrayLength - i - 1] = temp;
    }
  }

  public int[] reversedCopy(int[] values){
    int arrayLength = values.length;
    int reversedArray[] = new int[arrayLength];
    for (int i = 0; i < arrayLength; i++) {
      reversedArray[i] = values[arrayLength - i -1];
    }
    return reversedArray;
  }

  public void removeValue(int[] values, int target){
    
  }

  public int[] runningSum(int[] values){
    int arrayLength = values.length;
    int[] runningArray = new int[arrayLength];
    runningArray[0] = values[0];
    for (int i = 1; i < values.length; i++) {
      runningArray[i] = runningArray[i-1] + values[i];
    }
    return runningArray;
  }
}
