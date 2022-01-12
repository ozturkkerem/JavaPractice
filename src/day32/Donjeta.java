package day32;

import java.util.Arrays;

public class Donjeta {
    public static void main(String[] args) {

            //Given alphanumeric String we need to split the string into substrings of consecutive letters or numbers,
            // sort the induvidual string and append them back together
            // Inut:231 CBA 546 FDE 897              jfnehk538952  ncdakhj  384783fehwu8374
            //
            // Output:  123 ABC 456 DEF 789
            SortLettersAndNumbersFromString("231CBA546FDE897D");

        }
        public static void SortLettersAndNumbersFromString (String str){ //231 CBA 546 FDE 897
            String str1 = "";

            for (int i = 0; i <= str.length() - 1; i++) {
                str1 += "" + str.charAt(i);
                if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {  //A
                    if (Character.isDigit(str.charAt(i + 1))) {
                        str1 += " ";
                    }
                }  //str1=231CBA,546FDE,897
                if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {  //A
                    if (Character.isAlphabetic(str.charAt(i + 1))) {
                        str1 += " ";
                    }
                }//str1=231,CBA,546,FDE,897
            }
            String[] arr = str1.split(" ");
            str = "";
            for (String each : arr) {
                char[] chars = each.toCharArray();
                Arrays.sort(chars);  //arr=123,ABC,456, DEF, 789
                for (char eachChar : chars) {
                    str += "" + eachChar;
                }

            }
            System.out.println(str);

        }
    }