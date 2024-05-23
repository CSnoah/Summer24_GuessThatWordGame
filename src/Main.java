import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        WordEngine wE = new WordEngine("words.txt");
        Scanner input = new Scanner(System.in);
        String perRoundGuess = "";

        // game loop
        while (!perRoundGuess.equals("exit")) {
            System.out.println("| Guess the Word:     |");
            wE.printCensored();
            System.out.println();
            System.out.print("| Enter a guess(exit to quit): ");
            perRoundGuess = input.next();
            if (!perRoundGuess.equals("exit")) {
                wE.updateGuessState(perRoundGuess);
                if (wE.isCorrect(perRoundGuess)) {
                    System.out.println("Yay you got it Right!!!!!");
                }
            } else {
                System.out.println("Have a nice day!");
                break;
            }
            System.out.println();
        }

    }
}