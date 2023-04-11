import java.util.*;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // Welcoming the player
        System.out.println("Welcome to Bato - Bato Pik Game! ");
        System.out.print("Please Enter your IGN: ");
        String name = scan.nextLine();
        System.out.println("\nOnce again, Welcome to our Player " + name + " Enjoy Playing");

        // creating instances
        DecidingWhoIsTheWinner theWinner = new DecidingWhoIsTheWinner();
        GetTheUserInput userInput = new GetTheUserInput();

        // choices
        String[] picks = { "Rock", "Paper", "Scissors", "Exit" };

        // the game
        boolean playAgain = true;
        while (playAgain) {

            int user = userInput.getTheUserInput(picks);
            if (user == 3) {
                theWinner.finalWinner(name, playAgain);
                break;
            }
            int rand = random.nextInt(3);
            theWinner.WhoIsTheWinner(picks, user, rand);
            theWinner.score();

        }

    }

}
