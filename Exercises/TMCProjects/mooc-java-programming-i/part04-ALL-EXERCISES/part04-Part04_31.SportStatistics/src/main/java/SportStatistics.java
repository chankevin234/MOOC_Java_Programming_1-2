import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File: ");
        String file = scanner.nextLine();

        System.out.println("Team: ");
        String team = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            int gamesPlayed = 0;
            int win = 0;
            int loss = 0;
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                String[] rowParts = row.split(",");

                String homeTeam = rowParts[0];
                String awayTeam = rowParts[1];
                int scoreH = Integer.valueOf(rowParts[2]);
                int scoreA = Integer.valueOf(rowParts[3]);

                //just create objects based on chosen team?
                if (team.equals(homeTeam)) {
                    gamesPlayed++;
                    if (scoreH > scoreA) {
                        win++;
                    } else {
                        loss++;
                    }
                }

                if (team.equals(awayTeam)) {
                    gamesPlayed++;
                    if (scoreH < scoreA) {
                        win++;
                    } else {
                        loss++;
                    }
                }
            }
            System.out.println("Games: " + gamesPlayed);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + loss);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

}
