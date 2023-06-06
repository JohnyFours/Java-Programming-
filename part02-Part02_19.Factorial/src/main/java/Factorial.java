
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number? ");
        int i = Integer.valueOf(scanner.nextLine());
        
        int factorial = 1;
      

        while(i >= 1){
            factorial *= i;
            i--;
        }
        System.out.println("The sum is " + factorial);
    }
}
