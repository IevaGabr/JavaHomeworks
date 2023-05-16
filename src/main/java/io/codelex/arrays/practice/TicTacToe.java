package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        initBoard();
        displayBoard();

        System.out.println("Let's start a game!");
        int ascciiCharValue = -1;
        int hasWinner = 0;
        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 1) {
                ascciiCharValue = 88;
            } else {
                ascciiCharValue = 79;
            }
            System.out.println((char) ascciiCharValue + " choose your location (row, column)");
            String location = keyboard.nextLine();
            String[] locationArray = location.replace(" ", "").split("");
            int row = Integer.parseInt(locationArray[0]);
            int column = Integer.parseInt(locationArray[1]);
            board[row][column] = (char) ascciiCharValue;
            displayBoard();
            for (int j = 0; j < 3; j++) {
                if (board[j][0] == board[j][1] && board[j][0] == board[j][2] && board[j][0] != (char) 32) {
                    System.out.println(board[j][0] + " won!");
                    hasWinner++;
                }
            }
            for (int j = 0; j < 3; j++) {
                if (board[0][j] == board[1][j] && board[0][j] == board[2][j] && board[0][j] != (char) 32) {
                    System.out.println(board[0][j] + " won!");
                    hasWinner++;
                }
            }
            if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != (char) 32) {
                System.out.println(board[0][0] + " won!");
                hasWinner++;
            }
            if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != (char) 32) {
                System.out.println(board[0][2] + " won!");
                hasWinner++;
            }
            if (hasWinner > 0) {
                break;
            }
        }
        if (hasWinner == 0) {
            System.out.println("The game is tie!");
        }
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}