import java.util.Scanner;

public class DecidingWhoIsTheWinner{
    Scanner scan = new Scanner(System.in);
    // initialization of scores
    public int gamesPlayed = 0, player = 0, computer = 0, draw = 0;

    public void WhoIsTheWinner(String[]picks, int user, int rand){
        //picks
        System.out.println("\nYour Pick: " + picks[user]);
        System.out.println("Opponent: " + picks[rand]);
        System.out.println();

        gamesPlayed++;
        //Deciding who is the winner
        switch (user) {
            case 0:
                if(rand == 2){
                System.out.println("YOU WIN!");
                player++;
                }
                else if(rand == 1){
                System.out.println("YOU LOSE!");
                computer++;
                }
                else if(rand == user){
                System.out.println("DRAW");
                draw++;
                }
                break;
            case 2:
                if(rand == 1){
                System.out.println("YOU WIN!");
                player++;
                }
                else if(rand == 0){
                System.out.println("YOU LOSE!");
                computer++;
                }
                else if(rand == user){
                System.out.println("DRAW");  
                draw++;                  
                }
                break;
            case 1:
                if(rand == 0){
                System.out.println("YOU WIN!");
                player++;
                }
                else if(rand == 2){
                System.out.println("YOU LOSE!");
                computer++;
                }
                else if(rand == user){
                System.out.println("DRAW");
                draw++;
                }
                break;
            default:
                break;
            }
    }
    //the score
    public void score(){
        System.out.println("\nSCORE");
        System.out.println("\nPlayer: " + player + "\nComputer: " + computer + "\nDraw: " + draw);
        System.out.println("Games Played: " + gamesPlayed);
        System.out.println("\nWould you like to try again?"); 
    }

    public void finalWinner(String name, boolean playAgain){
        //The final score if the players exits
                    System.out.println("\nThank you for Playing!\n");
                    System.out.println("FINAL SCORE");                                    
                    System.out.println("\nPlayer: " + player + "\nComputer: " + computer + "\nDraw: "+ draw);
                    System.out.println("Games Played: " + gamesPlayed);

                    if(player > computer){
                            System.out.println("\nCONGRATULATIONS " + name + " YOU ARE THE WINNER!\n");
                    }
                    else if(computer > player){
                            System.out.println("\nYOU LOSE! Try again next time.\n");
                    }
                    else if(computer == player){
                            System.out.println("\nDRAW!\n");
                    }
                    

    }
    
}
