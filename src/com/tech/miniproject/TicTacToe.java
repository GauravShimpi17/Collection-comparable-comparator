package com.tech.miniproject;

import java.util.*;

public class TicTacToe {

    static String[] playBoard;
    static String turns;

    static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public String play() {
        String line = null;
        for (int a = 0; a <= 8; a++) {

            line = switch (a) {
                case 0 -> playBoard[0] + playBoard[1] + playBoard[2];
                case 1 -> playBoard[3] + playBoard[4] + playBoard[5];
                case 2 -> playBoard[6] + playBoard[7] + playBoard[8];
                case 3 -> playBoard[0] + playBoard[3] + playBoard[6];
                case 4 -> playBoard[1] + playBoard[4] + playBoard[7];
                case 5 -> playBoard[2] + playBoard[5] + playBoard[8];
                case 6 -> playBoard[0] + playBoard[4] + playBoard[8];
                case 7 -> playBoard[2] + playBoard[4] + playBoard[6];
                default -> line;
            };

            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(playBoard).contains(
                    String.valueOf(a + 1))) {
                break;
            } else if (a == 8) {
                return "draw";
            }
        }
        System.out.println(
                turns + "'s turn; enter a slot number to place " + turns + " in:");
        return null;
    }

    public void printBoard() {
        System.out.println("| " + playBoard[0] + " | " + playBoard[1] + " | " + playBoard[2] + " |");
        System.out.println();
        System.out.println("| " + playBoard[3] + " | " + playBoard[4] + " | " + playBoard[5] + " |");
        System.out.println();
        System.out.println("| " + playBoard[6] + " | " + playBoard[7] + " | " + playBoard[8] + " |");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = getScanner();

        playBoard = new String[9];
        turns = "X";
        String winner = null;

        for (int a = 0; a < 9; a++) {
            playBoard[a] = String.valueOf(a + 1);
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
            if (playBoard[input - 1].equals(
                    String.valueOf(input))) {
                playBoard[input - 1] = turns;

                if (turns.equals("X")) {
                    turns = "O";
                } else {
                    turns = "X";
                }

                game.printBoard();

                winner = game.play();
            } else {
                System.out.println(
                        "Slot already taken; re-enter :");
            }
        }
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw");
        } else {
            System.out.println(winner + " is winner! Thanks for playing.");
        }
    }
}
