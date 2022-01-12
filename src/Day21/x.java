package Day21;
import java.util.Arrays;
public class x {
    public static void main(String[] args) {


        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        // write your code below
        int count = 0;
        int i = 0;
        String[] sen = str.split(", ");
        String sortWords = "";
        Arrays.sort(sen);
        int min = sen[0].length();

        for (String word : sen) {
            if (word.length() < min) {
                min = word.length();
                ;
            }
            i++;
        }


        for (String word : sen) {
            if (word.length() == min) {
                count++;
                sortWords = word + " " + sortWords;
            }
            i++;
        }
        String [] sortArray = sortWords.split(" ");
        Arrays.sort(sortArray);
        System.out.println(Arrays.toString(sortArray));

    }
}


