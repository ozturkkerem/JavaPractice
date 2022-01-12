package Day16;

import java.util.Scanner;

public class FrequencyOfJava_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the sentences: ");
        String sentences = scan.nextLine();
        String word = scan.next();
        int len_word = word.length();
        int len_Sentences = sentences.length();
        char ch = 'i';
        int count = 0;
        for (int i = 0 ; i <= len_Sentences-len_word; i++){


            if (sentences.substring(i,i+len_word).equalsIgnoreCase(word))
            count++;

        }
        System.out.println(count);
scan.close();

    }
}
