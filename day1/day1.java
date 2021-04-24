import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.util.ArrayList;

public class day1 {

    public static void main(String[] args) {
        int true_result = 2020;

        File myFile = new File("/home/cem/dev/advent/day1/input.txt");

        ArrayList<Integer> list = input(myFile);

        int result = solved(list);

        if (result == 241861950) {
            System.out.println("nice");
        }

        // Ergebnis
        System.out.println(solved(list));

    }

    public static int solved(ArrayList<Integer> list) {
        int true_result = 2020;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    if (list.get(i) + list.get(j) + list.get(k) == true_result) {
                        int result = list.get(i) * list.get(j) * list.get(k);
                        return result;
                    }
                }
            }
        }
        return 0;
    }

    public static ArrayList<Integer> input(File file) {
        BufferedReader reader = null;
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;
            while ((text = reader.readLine()) != null) {
                list.add(Integer.parseInt(text));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}