import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordEngine {
    public static String [] words;
    int nextWord;
    String currentGuess;
    String currentWord;

    WordEngine() throws IOException {
        FileReader fr = new FileReader("trivia.txt");
        Scanner sc = new Scanner(fr);
        words = new String [sc.nextInt()];
        int i = 0;
        while (sc.hasNext()) {
            words[i] = sc.next();
            i++;
        }
        nextWord = 0;
    }

    public void setcurrentGuess() {
        for (int i = 0; i < currentWord.length(); i++) {
            currentWord += "X";
        }
    }

    public String getNextWord() {
        nextWord++;
        currentGuess = words[nextWord];
        return currentGuess;
    }

    public void printCensored() {
        if (nextWord == -1) {
            return;
        }
        for (int i = 0; i < words[nextWord].length(); i++) {
            System.out.println("X");
        }
    }

    public boolean guessword(St)
}
