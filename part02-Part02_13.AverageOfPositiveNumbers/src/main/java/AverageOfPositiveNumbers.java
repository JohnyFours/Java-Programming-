
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sumPositive = 0;

        while (true) {
            double number = Double.valueOf(scanner.nextLine());

            if (number > 0) {
                count = count + 1;
                sumPositive = sumPositive + number;
                continue;
            }
            if (number < 0) {
                continue;
            }
            if (count <= 0 && number == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            if (number == 0) {
                double average = sumPositive / count;
                System.out.println("The average of the positive numbers is " + average);
                break;
            }

        }
    }
}
