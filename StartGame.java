import java.util.Scanner;

class Guesser{
    int guessNum;

    int GuessNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Guessers' Number");
        guessNum = scanner.nextInt();
        return guessNum;
    }

}

class Player{
    int guessNumFromP;
    int GuessNumFromPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the player Number");
        guessNumFromP=scanner.nextInt();
        return  guessNumFromP;
    }
}

class Umpire{
    int numFromGuesser;
    int numFromPLayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectTheNumberFromGuesser() {
        Guesser guesser = new Guesser();
        numFromGuesser = guesser.GuessNumber();
    }

    void collectNumFromPlayer() {
        Player player1 =  new Player();
        Player player2 =  new Player();
        Player player3 =  new Player();
        numFromPLayer1 = player1.GuessNumFromPlayer();
        numFromPlayer2 = player1.GuessNumFromPlayer();
        numFromPlayer3 = player1.GuessNumFromPlayer();
    }

    void compare(){
        if(numFromGuesser == numFromPLayer1){
            if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3){
                System.out.println("all players won the game");
            }
            else if(numFromGuesser==numFromPlayer2){
                System.out.println("player1 and player 2 won the game");
            }
            else if(numFromGuesser == numFromPlayer3){
                System.out.println("Player 1 and Player 3 won the game");
            }
        }
        else if(numFromGuesser == numFromPlayer2){
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("player 2 and player 3 won the game");
            }
            else {
                System.out.println("player 2 won the game");
            }
        }
        else if(numFromGuesser==numFromPlayer3){
            System.out.println("player 3 won the game");
        }
        else {
            System.out.println("No one won the game");
        }
    }
}



public class StartGame {
    public static void main(String[] args) {
        Umpire umpire =  new Umpire();
        umpire.collectTheNumberFromGuesser();
        umpire.collectNumFromPlayer();
        umpire.compare();
    }
}
