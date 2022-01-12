package Day21;

import java.util.Arrays;

public class Palindromes {
    public static void main(String[] args) {

        String[] names = {"anna", "level", "Java", "kerek"};
        String[] reverseName = new String[names.length];
        int palindromes = 0;
        int k = 0;
        int j = 0;

        for (String name : names
        ) {
            String nameRe = "";

            for (int i = name.length() - 1; i >= 0; i--) {
                nameRe += name.charAt(i);

            }
            reverseName[j] = nameRe;
            j++;

            }

        for (String each:reverseName
        ) {
            if (each.equals(names[k]))
                palindromes++;
            k++;


        }
        System.out.println(palindromes);


    }
}