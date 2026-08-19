import java.util.Scanner;

public class ArrayStatistics {

    public void ArrayStatistics_main(Scanner scanner){
        Display(readArray(scanner));
    }

    public int readSize(Scanner scanner){
        System.out.println("Enter the size of the array: ");
        return scanner.nextInt();
    }

    public int[] readArray(Scanner scanner){
        int[] array = new int[readSize(scanner)];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element "+i+": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public int sum(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public double average(int[] values) {
        return sum(values) / values.length * 1.0;
    }

    public int minimum(int[] values) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < minimum) {
                minimum = values[i];
            }
        }
        return minimum;
    }

    public int maximum(int[] values) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < maximum) {
                maximum = values[i];
            }
        }
        return maximum;
    }

    public int countEven(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values.length % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public void printSignCounts(int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) {
                System.out.println("zero");
            } else if (values[i] > 0) {
                System.out.println("positive");
            } else {
                System.out.println("negetive");
            }
        }
    }

    public void Display(int[] array){
        System.out.println("SUM: " + sum(array));
        System.out.println("AVERAGE: " + average(array));
        System.out.println("MINIMUM: " + minimum(array));
        System.out.println("MAXIMUM: " + maximum(array));
        System.out.println("COUNT EVEN: " + countEven(array));
        printSignCounts(array);
    }
}

// pind turaan jado mallo mali kath lagda
// showan utte lagde queue