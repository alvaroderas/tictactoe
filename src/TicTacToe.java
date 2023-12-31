/**
 * A class for a Tic-Tac-Toe game.
 * 
 * This is a simple program that runs the entire game in the console. When a player
 * wins or draws, the program prints out the given situation.
 * 
 * Author: Alvaro Deras
 * Date: December 30, 2023
 */

import java.util.*;
public class TicTacToe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] myArray = new String[3][3];
        myArray[0][0] = myArray[0][1] = myArray[0][2] = myArray[1][0] = myArray[1][1] = myArray[1][2] = myArray[2][0] = myArray[2][1] = myArray[2][2] = "[]";
        boolean player1 = false;
        boolean player2 = false;

        for (int x = 0; x < 5; x++) {
            System.out.println("Enter a row (0, 1, 2) for Player 1: ");
            int row = input.nextInt();
            System.out.println("Enter a column (0, 1, 2) for Player 1: ");
            int column = input.nextInt();
            myArray[row][column] = "X";
            for (int a = 0; a < 3; a++) {
                for (int b = 0; b < 3; b++) {
                    System.out.print(myArray[a][b] + " ");
                }
                System.out.println();
            }
            if ((myArray[0][0] + myArray[0][1] + myArray[0][2]).equals("XXX")) {
                System.out.println("Player 1 wins!");
                player1 = true;
                break;
            }

            if ((myArray[0][0] + myArray[1][1] + myArray[2][2]).equals("XXX")) {
                System.out.println("Player 1 wins!");
                player1 = true;
                break;
            }
            if ((myArray[0][0] + myArray[1][0] + myArray[2][0]).equals("XXX")) {
                System.out.println("Player 1 wins!");
                player1 = true;
                break;
            }

            if ((myArray[1][0] + myArray[1][1] + myArray[1][2]).equals("XXX")) {
                System.out.println("Player 1 wins!");
                player1 = true;
                break;
            }

            if ((myArray[0][1] + myArray[1][1] + myArray[2][1]).equals("XXX")) {
                System.out.println("Player 1 wins!");
                player1 = true;
                break;
            }
            if ((myArray[0][2] + myArray[1][2] + myArray[2][2]).equals("XXX")) {
                System.out.println("Player 1 wins!");
                player1 = true;
                break;
            }
            if ((myArray[2][0] + myArray[2][1] + myArray[2][2]).equals("XXX")) {
                System.out.println("Player 1 wins!");
                player1 = true;
                break;
            }
            if ((myArray[2][0] + myArray[1][1] + myArray[0][2]).equals("XXX")) {
                System.out.println("Player 1 wins!");
                player1 = true;
                break;
            }


            if ((myArray[0][0] + myArray[0][1] + myArray[0][2]).equals("OOO")) {
                System.out.println("Player 2 wins!");
                player2 = true;
                break;
            }

            if ((myArray[0][0] + myArray[1][1] + myArray[2][2]).equals("OOO")) {
                System.out.println("Player 2 wins!");
                player2 = true;
                break;
            }
            if ((myArray[0][0] + myArray[1][0] + myArray[2][0]).equals("OOO")) {
                System.out.println("Player 2 wins!");
                player2 = true;
                break;
            }
            if ((myArray[1][0] + myArray[1][1] + myArray[1][2]).equals("OOO")) {
                System.out.println("Player 2 wins!");
                player2 = true;
                break;
            }

            if ((myArray[0][1] + myArray[1][1] + myArray[2][1]).equals("OOO")) {
                System.out.println("Player 2 wins!");
                player2 = true;
                break;
            }
            if ((myArray[0][2] + myArray[1][2] + myArray[2][2]).equals("OOO")) {
                System.out.println("Player 2 wins!");
                player2 = true;
                break;
            }
            if ((myArray[2][0] + myArray[2][1] + myArray[2][2]).equals("OOO")) {
                System.out.println("Player 2 wins!");
                player2 = true;
                break;
            }
            if ((myArray[2][0] + myArray[1][1] + myArray[0][2]).equals("OOO")) {
                System.out.println("Player 2 wins!");
                player2 = true;
                break;
            }
            if ((x == 4) && (player1 == false) && (player2 == false)) {
                System.out.println("It's a draw!");
                break;
            }

            System.out.println("Enter a row (0, 1, 2) for Player 2: ");
            int row2 = input.nextInt();
            System.out.println("Enter a column (0, 1, 2) for Player 2: ");
            int column2 = input.nextInt();
            myArray[row2][column2] = "O";
            
            for (int a = 0; a < 3; a++) {
                for (int b = 0; b < 3; b++) {
                    System.out.print(myArray[a][b] + " ");
                }
                System.out.println();
            }
            if ((myArray[0][0] + myArray[0][1] + myArray[0][2]).equals("XXX")) {
                System.out.println("Player 1 wins!");
                player1 = true;
                break;
            }

            if ((myArray[0][0] + myArray[1][1] + myArray[2][2]).equals("XXX")) {
                System.out.println("Player 1 wins!");
                player1 = true;
                break;
            }
            if ((myArray[0][0] + myArray[1][0] + myArray[2][0]).equals("XXX")) {
                System.out.println("Player 1 wins!");
                player1 = true;
                break;
            }

            if ((myArray[1][0] + myArray[1][1] + myArray[1][2]).equals("XXX")) {
                System.out.println("Player 1 wins!");
                player1 = true;
                break;
            }

            if ((myArray[0][1] + myArray[1][1] + myArray[2][1]).equals("XXX")) {
                System.out.println("Player 1 wins!");
                player1 = true;
                break;
            }
            if ((myArray[0][2] + myArray[1][2] + myArray[2][2]).equals("XXX")) {
                System.out.println("Player 1 wins!");
                player1 = true;
                break;
            }
            if ((myArray[2][0] + myArray[2][1] + myArray[2][2]).equals("XXX")) {
                System.out.println("Player 1 wins!");
                player1 = true;
                break;
            }
            if ((myArray[2][0] + myArray[1][1] + myArray[0][2]).equals("XXX")) {
                System.out.println("Player 1 wins!");
                player1 = true;
                break;
            }
            if ((myArray[0][0] + myArray[0][1] + myArray[0][2]).equals("OOO")) {
                System.out.println("Player 2 wins!");
                player2 = true;
                break;
            }

            if ((myArray[0][0] + myArray[1][1] + myArray[2][2]).equals("OOO")) {
                System.out.println("Player 2 wins!");
                player2 = true;
                break;
            }
            if ((myArray[0][0] + myArray[1][0] + myArray[2][0]).equals("OOO")) {
                System.out.println("Player 2 wins!");
                player2 = true;
                break;
            }
            if ((myArray[1][0] + myArray[1][1] + myArray[1][2]).equals("OOO")) {
                System.out.println("Player 2 wins!");
                player2 = true;
                break;
            }

            if ((myArray[0][1] + myArray[1][1] + myArray[2][1]).equals("OOO")) {
                System.out.println("Player 2 wins!");
                player2 = true;
                break;
            }
            if ((myArray[0][2] + myArray[1][2] + myArray[2][2]).equals("OOO")) {
                System.out.println("Player 2 wins!");
                player2 = true;
                break;
            }
            if ((myArray[2][0] + myArray[2][1] + myArray[2][2]).equals("OOO")) {
                System.out.println("Player 2 wins!");
                player2 = true;
                break;
            }
            if ((myArray[2][0] + myArray[1][1] + myArray[0][2]).equals("OOO")) {
                System.out.println("Player 2 wins!");
                player2 = true;
                break;
            }

            if ((x == 4) && (player1 == false) && (player2 == false)) {
                System.out.println("It's a draw!");
                break;
            }
        }
    }
}