import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;

public class day2 {
    public static void main(String[] args) {

        globalCounter("/home/cem/dev/advent/day2/input2.txt");

    }

    public static boolean solved(String input, char searched, int min, int max) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == searched) {
                count++;
            }
        }
        if (count >= min && count <= max) {
            return true;
        }
        return false;
    }

    public static boolean solvedAtPosition(String input, char searched, int start, int end) {

        char begin = input.charAt(start+1);
        char finish = input.charAt(end+1);


        if (searched == begin|| searched == finish) {
            return true;
        }
        return false;
    }

    public static int globalCounter(String path) {
        int ruleAppliedCounter = 0;
        try {
            Scanner scanner = new Scanner(Paths.get(path));

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                String[] bananSplit = line.split("[\\s\\-\\:\\.\\'\\?\\,\\_\\@]+");

                int min = Integer.parseInt(bananSplit[0]);
                int max = Integer.parseInt(bananSplit[1]);

                String tmp = bananSplit[2];

                char letter = tmp.charAt(0);

                String word = bananSplit[3];

                solvedAtPosition(word, letter, min, max);

                if (solvedAtPosition(word, letter, min, max)) {
                    ruleAppliedCounter++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.printf("The global counter is: %d%n", ruleAppliedCounter);

        }
        return ruleAppliedCounter;
    }

}
