import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[][] arr1 = { { 1, 0 }, { 0, 1 } };
    int[][] arr2 = { { 0, 1 }, { 1, 0 } };
    MatrixOperations MO = new MatrixOperations();
    MO.MatrixOperations_main(arr1, arr2);

    ArrayStatistics AS = new ArrayStatistics();
    AS.ArrayStatistics_main(scanner);

    LinearSearchToolkit LST = new LinearSearchToolkit();
    LST.LinearSearchToolkit_main(scanner);

    ArrayTransformations AT = new ArrayTransformations();
    AT.ArrayTransformations_main(scanner);

    scanner.close();

  }
}
