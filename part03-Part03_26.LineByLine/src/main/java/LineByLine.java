
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String string = scanner.nextLine();
            String[] word = string.split(" ");
            if (string.equals("")) {
                break;
            }

            for (int i = 0; i < word.length; i++) {
                System.out.println(word[i]);
            }
            
        }

    }
}
