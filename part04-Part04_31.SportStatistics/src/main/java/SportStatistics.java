
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");

        String file = scanner.nextLine();

        System.out.println("Team:");
        String team = scanner.nextLine();

        int games = 0;

        int win = 0;

        int lose = 0;

        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {

                String[] line = fileScanner.nextLine().split(",");

                if (line.equals("")) {
                    continue;
                }

                String homeTeam = line[0];
                String awayTeam = line[1];
                int homePoints = Integer.valueOf(line[2]);

                int awayPoints = Integer.valueOf(line[3]);

                if (team.equals(homeTeam)) {
                    if (homePoints > awayPoints) {
                        win++;
                    } else {
                        lose++;
                    }
                    games++;
                }
                if (team.equals(awayTeam)) {

                    if (awayPoints > homePoints) {
                        win++;
                    } else {
                        lose++;
                    }
                    games++;
                }
            }
            System.out.println("Games: " + games);

            System.out.println("Wins: " + win);

            System.out.println("Losses: " + lose);

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }

}
