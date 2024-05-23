import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordEngine {
    public static String [] words;
    int currentWordIndex;
    StringBuffer guessState;

    WordEngine(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        Scanner sc = new Scanner(fr);
        words = new String [sc.nextInt()];
        int i = 0;
        while (sc.hasNext()) {
            words[i] = sc.next();
            i++;
        }
        guessState = new StringBuffer();
        for (int j = 0; j < words[currentWordIndex].length(); j++) {
            guessState.append("X");
        }
        currentWordIndex = 0;
    }

    public StringBuffer getGuessState () { return guessState; }

    public String getCurrentWord() {
        return words[currentWordIndex];
    }

    public void setNextWord() { currentWordIndex++; }

    public void resetGuessState() {
        guessState = new StringBuffer();
        for(int i = 0; i < words[currentWordIndex].length(); i++) {
            guessState.append("X");
        }
    }
    public void printCensored() {
        System.out.print("| " + guessState + " - length: " + guessState.length() + " |");
    }
    public boolean isCorrect(String guess) {
        if (guess.equals(words[currentWordIndex])) {
            setNextWord();
            resetGuessState();
            return true;
        } else {
            return false;
        }
    }

    public void updateGuessState(String guess) {
        if (guess.length() != words[currentWordIndex].length()) {
            System.out.println("Not the correct length");
            return;
        } else {
            for(int i = 0; i < words[currentWordIndex].length(); i++) {
                if (guess.charAt(i) == words[currentWordIndex].charAt(i)) {
                    guessState.setCharAt(i, words[currentWordIndex].charAt(i));
                }
            }
        }


    }
}
