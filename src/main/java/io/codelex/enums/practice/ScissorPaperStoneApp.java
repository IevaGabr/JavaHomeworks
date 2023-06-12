package io.codelex.enums.practice;

import java.util.Scanner;

import static java.lang.System.exit;

public class ScissorPaperStoneApp {

    public static final Scanner input = new Scanner(System.in);
    public static int countGames = 0;
    public static int userWon = 0;
    public static int pcWon = 0;
    public static double pcWonPercentage = 0;
    public static double userWonPercentage = 0;

    public static void main(String[] args) {
        System.out.println("Let us begin...");
        System.out.println("Scissor-Paper-Stone");
        System.out.println("Your turn (Enter s for scissor, p for paper, t for stone, q to quit):");
        String userChoice = input.nextLine();
        while (!userChoice.equals("q")) {
            scissorPaperStoneGame(userChoice);
            countGames++;
            System.out.println("Scissor-Paper-Stone");
            System.out.println("Your turn (Enter s for scissor, p for paper, t for stone, q to quit):");
            userChoice = input.nextLine();
        }
        outputGameStatistic();
    }

    public static void scissorPaperStoneGame(String userChoice) {
        if (userChoice.matches("[pst]")) {
            ScissorPaperStone user = ScissorPaperStone.getUserChoice(userChoice);
            ScissorPaperStone[] pcChoices = {ScissorPaperStone.PAPER, ScissorPaperStone.SCISSOR, ScissorPaperStone.STONE};
            ScissorPaperStone pcChoice = pcChoices[(int) (Math.random() * 3)];
            System.out.println("My turn: " + pcChoice);
            if (user.winsGame(pcChoice)) {
                System.out.println(user.getName() + " " + user.getOperation() + " " + pcChoice.getName() + ", You won!");
                userWon++;
            } else if (pcChoice.winsGame(user)) {
                System.out.println(pcChoice.getName() + " " + pcChoice.getOperation() + " " + user.getName() + ", I won!");
                pcWon++;
            } else {
                System.out.println("Tie!");
            }
        } else {
            System.out.println("Invalid input, try again...");
            System.out.println("Your turn (Enter s for scissor, p for paper, t for stone, q to quit):");
            userChoice = input.nextLine();
            if (userChoice.equals("q")) {
                outputGameStatistic();
                exit(0);
            } else {
                scissorPaperStoneGame(userChoice);
            }
        }

    }

    public static void outputGameStatistic() {
        System.out.println("Number of trials: " + countGames);
        if (countGames != 0) {
            pcWonPercentage = (double) pcWon / countGames * 100;
            userWonPercentage = (double) userWon / countGames * 100;
        }
        System.out.println("I won " + pcWon + "(" + String.format("%.2f", pcWonPercentage) + "%). " +
                "You won " + userWon + "(" + String.format("%.2f", userWonPercentage) + "%).");
        System.out.println("Bye!");
    }
}
