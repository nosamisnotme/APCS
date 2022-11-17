package Hangman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board Board = new Board();
        String guessP = Board.getPhrase();
        int player = 1;
        int i = 0;
        String guess = "";
        boolean canGuess = true;
        Boolean b = true;
        while ((i < 6)&&Board.getBP() != (guessP + " ")){
            if (player == 1){
                System.out.println("Player 1:");
            }
            else if (player == -1){
                System.out.println("Player 2:");
            }
            System.out.println("...............................");
            if (i == 0){
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
            }
            if (i == 1){
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  0   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
            }
            if (i == 2){
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  0   |");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
            }
            if (i == 3){
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  0   |");
                System.out.println(" /|   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
            }
            if (i == 4){
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  0   |");
                System.out.println(" /|\\  |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
            }
            if (i == 5){
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  0   |");
                System.out.println(" /|\\  |");
                System.out.println(" /    |");
                System.out.println("      |");
                System.out.println("=========");
            }
            if (b == true){
                System.out.println(Board.getBlankPhrase());
                b = false;
            }
            System.out.println(Board.getBP());
            System.out.println((6 - i) + " wrong guesses left");
            System.out.println("Guessed letters:\n" + Board.getGuessesF());
            System.out.println("...............................");
            System.out.print("Input(letter or phrase guess): ");
            if (canGuess == true){
                guess = sc.nextLine();
            }
            if (guess.equals(guessP)){
                if (player == 1){
                    canGuess = false;
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("Player 1 wins!");
                }
                else {
                    canGuess = false;
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("Player 2 wins!");
                }
            }
            else if (!Board.getGuessesF().contains(guess)){
                Board.guess(guess);
                player *= -1;
            }
            else {
                System.out.println("You already guessed that letter!");
            }
            if ((!guessP.contains(guess)||!Board.getGuessesF().contains(guess))&&(!guess.equals(guessP))){
                i++;
                System.out.println("Wrong!");
            }
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.print("\033[H\033[2J");  
            System.out.flush();
        }
        canGuess = false;
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  0   |");
        System.out.println(" /|\\  |");
        System.out.println(" / \\  |");
        System.out.println("      |");
        System.out.println("=========");
        if (player == 1){
            System.out.println("Player 1 loses!");
        }
        else {
            System.out.println("Player 2 loses!");
        }
    }
}
