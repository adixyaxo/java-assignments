import java.util.Scanner;

public class BitMaskUtility {

  public void menu(Scanner scanner) {

    System.out.print("Enter the number: ");
    int number = scanner.nextInt();

    while (true) {

      int operation = operationInput(scanner);

      if (operation == -1) {
        break;
      }

      number = bitCases(operation, number, scanner);

      System.out.println("\nCurrent Number: " + number);
      System.out.println("Binary: " + toBinary32(number));
      System.out.println();
    }
  }

  public int bitCases(int operation, int number, Scanner scanner) {

    switch (operation) {

      case 1:
        int position1 = positionInput(scanner);

        if (position1 == -1) {
          return number;
        }

        System.out.println(
            "Is bit set: " + isBitSet(number, position1));

        break;

      case 2:
        int position2 = positionInput(scanner);

        if (position2 == -1) {
          return number;
        }

        number = setBit(number, position2);

        System.out.println("Bit set successfully.");

        break;

      case 3:
        int position3 = positionInput(scanner);

        if (position3 == -1) {
          return number;
        }

        number = clearBit(number, position3);

        System.out.println("Bit cleared successfully.");

        break;

      case 4:
        int position4 = positionInput(scanner);

        if (position4 == -1) {
          return number;
        }

        number = toggleBit(number, position4);

        System.out.println("Bit toggled successfully.");

        break;

      case 5:
        System.out.println(
            "Binary: " + toBinary32(number));

        break;

      default:
        System.out.println("Invalid operation.");

    }

    return number;
  }

  public int operationInput(Scanner scanner) {

    System.out.println("Available Operations");
    System.out.println("1. isBitSet");
    System.out.println("2. setBit");
    System.out.println("3. clearBit");
    System.out.println("4. toggleBit");
    System.out.println("5. toBinary32");
    System.out.println("-1. Exit");

    System.out.print("Enter the operation: ");

    int operation = scanner.nextInt();

    if (operation == -1) {
      return -1;
    }

    if (operation < 1 || operation > 5) {
      System.err.println("Invalid Operation Choice");
      return operationInput(scanner);
    }

    return operation;
  }

  public int positionInput(Scanner scanner) {

    System.out.print("Enter the bit position (0-31, -1 to exit): ");

    int position = scanner.nextInt();

    if (position == -1) {
      return -1;
    }

    if (!validateBitPosition(position)) {
      System.err.println(
          "Invalid bit position. Must be between 0 and 31.");

      return positionInput(scanner);
    }

    return position;
  }

  public String toBinary32(int number) {

    return String.format(
        "%32s",
        Integer.toBinaryString(number)).replace(' ', '0');
  }

  public boolean validateBitPosition(int position) {

    return position >= 0 && position <= 31;
  }

  public boolean isBitSet(int number, int position) {

    return (number & (1 << position)) != 0;
  }

  public int setBit(int number, int position) {

    return number | (1 << position);
  }

  public int clearBit(int number, int position) {

    return number & ~(1 << position);
  }

  public int toggleBit(int number, int position) {

    return number ^ (1 << position);
  }

}