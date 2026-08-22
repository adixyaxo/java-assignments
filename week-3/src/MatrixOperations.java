public class MatrixOperations {

  public void MatrixOperations_main(int[][] first,int[][] second){
    System.out.println("PERFORMING ALL POSSIBLE OPERATIONS ON THE ARRAYS");
    System.out.println();

    System.out.println("row Sum for first array");
    printMatrix(rowSums(first));
    System.out.println("row Sum for second array");
    printMatrix(rowSums(second));
    System.out.println();

    System.out.println("column Sum for first array");
    printMatrix(columnSums(first));
    System.out.println("column Sum for second array");
    printMatrix(columnSums(second));
    System.out.println();

    System.out.println("Transpose for first array");
    printMatrix(transpose(first));
    System.out.println("Transpose for second array");
    printMatrix(transpose(second));
    System.out.println();

    System.out.println("ADDITION");
    printMatrix(add(first, second));

    System.out.println();

    System.out.println("MULTIPLICATION");
    printMatrix(multiply(first, second));

  }

  public int[] rowSums(int[][] matrix) {
    int[] matrixRowSum = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      int sum = 0;
      for (int j = 0; j < matrix[i].length; j++) {
        sum += matrix[i][j];
      }
      matrixRowSum[i] = sum;
    }
    return matrixRowSum;
  }

  public int[] columnSums(int[][] matrix) {
    int[] matrixColumnSum = new int[matrix[0].length];
    for (int i = 0; i < matrix[0].length; i++) {
      int sum = 0;
      for (int j = 0; j < matrix.length; j++) {
        sum += matrix[j][i];
      }
      matrixColumnSum[i] = sum;
    }
    return matrixColumnSum;
  }

  public int[][] add(int[][] first, int[][] second) {
    if (first.length != second.length || first[0].length != second[0].length) {
      System.out.println("The Dimentions of the Arrays are not the same");
      int sample[][] = new int[1][1];
      sample[0][0] = -1;
      return sample;
    }
    int[][] arraySum = new int[second.length][second[0].length];
    for (int i = 0; i < second.length; i++) {
      for (int j = 0; j < second[i].length; j++) {
        arraySum[i][j] = first[i][j] + second[i][j];
      }
    }
    return arraySum;
  }

  public int[][] transpose(int[][] matrix) {
    int rows = matrix.length;
    int columns = matrix[0].length;
    int[][] arrayTranspose = new int[columns][rows];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        arrayTranspose[j][i] = matrix[i][j];
      }
    }
    return arrayTranspose;
  }

  public int[][] multiply(int[][] first, int[][] second) {
    if (first[0].length != second.length) {
      System.out.println("The diamention of both arrays is not right");
      int[][] array = new int[1][1];
      array[0][0] = -1;
      return array;
    }
    int rows = first.length;
    int columns = second[0].length;
    int[][] array = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        int sum = 0;
        for (int j2 = 0; j2 < columns; j2++) {
          sum += first[i][j2] * second[j2][j];
        }
        array[i][j] = sum;
      }
    }
    return array;

  }

  public void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }
  }

    public void printMatrix(int[] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      System.out.print(matrix[i]);
      System.out.print(" ");
    }
    System.out.println();
  }

}
