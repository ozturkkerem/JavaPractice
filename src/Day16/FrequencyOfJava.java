package Day16;

import java.util.Scanner;

public class FrequencyOfJava {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the sentences: ");
        String sentences = scan.nextLine();

        int len_Sentences = sentences.length();
        char ch = 'i';
        int count = 0;
        for (int i = 0 ; i <= len_Sentences-1; i++){


            if (sentences.charAt(i) == 'J' && sentences.charAt(i+1) == 'a' && sentences.charAt(i+2) == 'v' && sentences.charAt(i+3) == 'a')
            count++;

        }
        System.out.println(count);
scan.close();

    }
}
