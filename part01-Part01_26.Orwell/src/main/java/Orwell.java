
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int numberOrvell = 1984;

        if (number == numberOrvell) {
            System.out.println("Orwell");
        }

        // Write your program here
    }
}
