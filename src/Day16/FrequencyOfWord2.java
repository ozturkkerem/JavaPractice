package Day16;

import javax.swing.*;

public class FrequencyOfWord2 {
    public static void main(String[] args) {



    String word = "car car car car";

    int count = 0;

    for(int i = 0; i <= word.length()-3; i++)
    {
        if(word.substring(i, i+3).equalsIgnoreCase("car"))
        count++;

    }
        System.out.println(count);

    }

}
