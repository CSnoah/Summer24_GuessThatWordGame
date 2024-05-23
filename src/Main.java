import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String [] words = loadWords();

    }

   public static void censor() {

   }

    public static String [] loadWords() throws IOException {
        FileReader fr = new FileReader("trivia.txt");
        Scanner sc = new Scanner(fr);
        String[] trivia = new String[sc.nextInt()];
        int i = 0;
        while (sc.hasNext()) {
            trivia[i] = sc.next();
            i++;
        }
        return trivia;
    }
}