import java.util.Scanner;

public class BitMaskUtility {

  public void menu(Scanner scanner){
  System.out.print("Enter the number: ");
  int number = scanner.nextInt();
  System.out.print("Enter the bit position: ");
  int position = scanner.nextInt();
  System.out.println("Available Operations\nisBitSet: 1\nsetBit: 2\nclearBit: 3\ntoggleBit: 4\ntoBinary32: 5\n");
  System.out.print("Enter the operation: ");
  int operation = scanner.nextInt();
  if (!validateBitPosition(position)) {
    System.err.println("The bit position is not valid");
  }

  }

  public boolean validateBitPosition(int position){
    if (position>=0 & position<=31) {
      return true;
    }
    return false;
  }

  public boolean isBitSet(int number, int position){

  }

  public int setBit(int number, int position){

  }

  public int clearBit(int number, int position){

  }

  public int toggleBit(int number, int position){

  }

  public String toBinary32(int number){

  }

}
