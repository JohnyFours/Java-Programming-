/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleks
 */
import java.util.Scanner;
public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;
    
     public UserInterface(JokeManager jManger, Scanner scanner) {
        this.jokeManager = jManger;
        this.scanner = scanner;
    }
     public void start() {

        boolean shouldLoop = true;
        while (shouldLoop) {
            System.out.print("Commands:" + "\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop\n");

            String userInput = scanner.nextLine();

            switch (userInput) {
                case "X":
                    shouldLoop = false;
                    break;
                case "1":

                    System.out.print("Write the joke to be added:");
                    String jokeToAdd = scanner.nextLine();
                    //adds joke to jokemanager / array list
                    jokeManager.addJoke(jokeToAdd);

                    break;
                case "2":
                    System.out.println(jokeManager.drawJoke());

                    break;
                case "3":
                    jokeManager.printJokes();

                    break;
                default:
                    System.out.println("Unknown command");

            }

        }

    }
    
}
