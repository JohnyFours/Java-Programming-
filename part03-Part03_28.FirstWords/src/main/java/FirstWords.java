
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            String[] word = input.split(" ");
            
            System.out.println(word[word.length - 1]);

            if (input.equals("")) {
                break;
            }
            
           
        }
    }
}
