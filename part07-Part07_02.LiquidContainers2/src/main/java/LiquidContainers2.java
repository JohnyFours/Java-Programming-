
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container containerFirst = new Container();
        Container containerSecond = new Container();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print(
                    "First: " + containerFirst + "\n"
                    + "Second: " + containerSecond + "\n");

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] userInputSplit = input.split(" ");
            
            String command = userInputSplit[0];
            
            int amount = Integer.valueOf(userInputSplit[1]);
            
            switch (command) {
                case "add":

                    containerFirst.add(amount);

                    break;
                case "move":
                    
                    // if its negative or the value to move is return and do nothing
                    if (amount <= 0 || containerFirst.contains() == 0) {
                        return;
                    }
                    // if it ends up being a negative valule when moving says trying to move 40 from 30
                    // just move the total value of firstcontainer
                    if (containerFirst.contains() - amount < 0) {
                        amount = containerFirst.contains();
                    }

                    containerFirst.remove(amount);

                    containerSecond.add(amount);

                    break;
                case "remove":
                    containerSecond.remove(amount);

                    break;
                default:
                    System.out.println("Unknown command");

            }

        }
    }

}
