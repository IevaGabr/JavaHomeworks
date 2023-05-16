package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playGame = true;
        while (playGame) {
            playHangman();
            System.out.println("Play 'again' or 'quit'?");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("quit")) {
                playGame = false;
            }
        }
        System.out.println("Goodbye!");

    }

    public static void playHangman() {
        Scanner input = new Scanner(System.in);
        String[] listOfWords = {"cat", "dog", "tiger", "lion", "rabbit", "leopard", "bear", "camel", "possum", "elephant",
                "hippopotamus", "zebra", "giraffe"};
        String wordToGuess = listOfWords[(int) (Math.random() * listOfWords.length)];
        String[] wordToGuessArray = wordToGuess.split("");
        String[] displayArray = new String[wordToGuess.length()];
        String line = "-=-=-=-=-=-=-=-=-=-=-=-=-=-";
        System.out.println(line);
        System.out.println("Let's start a game!");
        String display = "Word: ";
        for (int i = 0; i < displayArray.length; i++) {
            displayArray[i] = "_ ";
            display = display + displayArray[i] + " ";
        }
        System.out.println(display);
        String missedLetters = "";
        System.out.println("Misses: " + missedLetters);
        String letter;
        int guessedLetterCount = 0;
        int countMistakes = 0;
        int allowedMistakes = wordToGuess.length() + 1;
        if (allowedMistakes > 7) {
            allowedMistakes = 7;
        }
        int check = 0;
        while (countMistakes <= allowedMistakes) {
            check = guessedLetterCount;
            System.out.println("Guess a letter:");
            letter = input.nextLine();
            for (int i = 0; i < wordToGuessArray.length; i++) {
                if (letter.equalsIgnoreCase(wordToGuessArray[i])) {
                    guessedLetterCount++;
                    displayArray[i] = letter;
                }
            }
            if (check == guessedLetterCount) {
                countMistakes++;
                missedLetters = missedLetters + letter;
            }
            System.out.println(line);
            display = "Word: ";
            for (int j = 0; j < displayArray.length; j++) {
                display = display + displayArray[j] + " ";
            }
            System.out.println(display);
            System.out.println("Misses: " + missedLetters);

            if (guessedLetterCount == wordToGuess.length()) {
                System.out.println("You got it!");
                break;
            }
            if (countMistakes == allowedMistakes) {
                System.out.println("Game over!");
                break;
            }
        }

    }

}
