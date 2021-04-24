import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.util.ArrayList;

public class day2 {
    public static void main(String[] args){

        //How many inputs are valid?

        File myFile = new File("/home/cem/dev/advent/day2/input2.txt");

        ArrayList<Integer> list = input(myFile);

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
