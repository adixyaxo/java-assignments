import java.util.Scanner;

public class App {

  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

  ArrayStatistics AS = new ArrayStatistics();
  AS.ArrayStatistics_main(scanner);

  LinearSearchToolkit LST = new LinearSearchToolkit();
  LST.LinearSearchToolkit_main(scanner);

  scanner.close();

  }
}
