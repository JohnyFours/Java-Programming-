
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeBook gradeBook = new GradeBook();

        UserInterface userInterface = new UserInterface(scanner, gradeBook);
        userInterface.start();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
