
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            double number = Double.valueOf(scanner.nextLine());

            if (number > 0 || number < 0) {
                count = count + 1;
                sum = sum + number;
                continue;
            }
            if (number == 0) {
                double average = sum / count;

                System.out.println("Average of the numbers: " + average);
                break;
            }
        }

    }
}
