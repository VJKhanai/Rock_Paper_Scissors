import java.util.*;

public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.println("Enter your move (rock, paper, scissors): ");
            String playerMove = scan.nextLine().toLowerCase();

            while (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                System.out.println("Invalid move! Please enter rock, paper, or scissors:");
                playerMove = scan.nextLine().toLowerCase();
            }

            int cpuChoice = rand.nextInt(3);
            String cpuMove = "";

            switch (cpuChoice) {
                case 0:
                    cpuMove = "rock";
                    break;
                case 1:
                    cpuMove = "paper";
                    break;
                case 2:
                    cpuMove = "scissors";
                    break;
            }

            System.out.println("CPU played: " + cpuMove);

            String result = checkWinner(playerMove, cpuMove);
            System.out.println(result);

            System.out.println("Do you want to play again? (yes/no)");
            String again = scan.nextLine().toLowerCase();
            if (!again.equals("yes")) {
                break;
            }
        }
    }

    public static String checkWinner(String playerMove, String cpuMove) {
        if (playerMove.equals(cpuMove)) {
            return "It's a tie!";
        }

        List<String> rockBeats = Arrays.asList("scissors");
        List<String> paperBeats = Arrays.asList("rock");
        List<String> scissorsBeats = Arrays.asList("paper");

        if (playerMove.equals("rock") && rockBeats.contains(cpuMove)) {
            return "You win!";
        } else if (playerMove.equals("paper") && paperBeats.contains(cpuMove)) {
            return "You win!";
        } else if (playerMove.equals("scissors") && scissorsBeats.contains(cpuMove)) {
            return "You win!";
        } else {
            return "CPU wins!";
        }
    }
}
