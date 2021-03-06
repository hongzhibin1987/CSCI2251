// Programming Assignment #1: TicTacToe
// Play a game of Tic Tac Toe
// ================================================
// School of Business and Information Technology
// Central New Mexico Communit College
// Course: CSCI-2251, Spring 2021
// Author: Zhibin "Bing" Hong
// 01/14/2021
import java.util.Scanner;
public class TicTacToeTest {
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);

      String playerO = "Player O";
      String playerX = "Player X";

      //instantiate
      TicTacToe game = new TicTacToe(playerO, playerX);

      //main loop to determine the game status.
      while (game.getStatus() == TicTacToe.gameStatus.CONTINUE){
         int row, col;
         boolean done = false;
         do {
            game.printBoard();
            System.out.print(game.getPlayer() + "'s" + " turn. \n");
            System.out.println(game.getPlayer() + ", Enter row(0, 1, or 2):");
            row = userInput.nextInt();
            System.out.println(game.getPlayer() + ", Enter col(0, 1, or 2):");
            col = userInput.nextInt();

            if (!game.validMove(row, col)) {
               System.out.println("Enter invalid. Please reenter your choice");
               }
            else {
               done = true;
            }
         }
         while (!done);
         game.setMove(row, col);
         game.swapMove();
      }
      game.printBoard();
      TicTacToe.gameStatus win = game.getStatus();
      if (win == TicTacToe.gameStatus.DRAW)
         System.out.println("This game is a Draw!");
         else{
            game.printWinner();
      }
   }
}