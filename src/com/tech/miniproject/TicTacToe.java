package com.tech.miniproject;

import java.util.*;

public class TicTacToe {

    static String[] board;
    static String turn;

    static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public String play() {
        String line = null;
        for (int a = 0; a <= 8; a++) {

            line = switch (a) {
                case 0 -> board[0] + board[1] + board[2];
                case 1 -> board[3] + board[4] + board[5];
                case 2 -> board[6] + board[7] + board[8];
                case 3 -> board[0] + board[3] + board[6];
                case 4 -> board[1] + board[4] + board[7];
                case 5 -> board[2] + board[5] + board[8];
                case 6 -> board[0] + board[4] + board[8];
                case 7 -> board[2] + board[4] + board[6];
                default -> line;
            };


            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(a + 1))) {
                break;
            } else if (a == 8) {
                return "draw";
            }
        }
        System.out.println(
                turn + "'s turn; enter a slot number to place "
                        + turn + " in:");
        return null;
    }

    public void printBoard() {
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println();
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println();
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = getScanner();

        board = new String[9];
        turn = "X";
        String winner = null;

        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }

        TicTacToe game = new TicTacToe();
        game.printBoard();

        System.out.println("X will play first : ");

        while (winner == null) {
            int input;

            try {
                input = sc.nextInt();
                if (!(input > 0 && input <= 9)) {
                    System.out.println("Invalid Input! Try again");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Invalid Input! Try again");
                continue;
            }
            if (board[input - 1].equals(
                    String.valueOf(input))) {
                board[input - 1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }

                game.printBoard();

                winner = game.play();
            } else {
                System.out.println(
                        "Slot already taken; re-enter :");
            }
        }
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                    "It's a draw");
        }


        else {
            System.out.println(
                    winner + " is winner! Thanks for playing.");
        }


    }


}
