package day29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl";

        String [] arr = str.split("");

        ArrayList <String> list = new ArrayList<>(Arrays.asList(arr));

        String unique = "";

        for (String each : list) {
        int count = Collections.frequency(list,each);
        if (count==1)

            unique+= each;

        }

        System.out.println(unique);
    }
}
