package Day24;

import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {

        String str1 = "cba";
        String str2 = "bac";
        System.out.println(checkAnagram(str1,str2));
    }


    public static boolean checkAnagram(String word1, String word2){
        boolean isAnagram = false;

        if (word1.length() != word2.length())
        return isAnagram;
        else{
            char [] toAr1= word1.toCharArray();
            System.out.println(Arrays.toString(toAr1));
            char [] toAr2= word2.toCharArray();
            System.out.println(Arrays.toString(toAr2));
            Arrays.sort(toAr1);
            System.out.println(Arrays.toString(toAr1));
            Arrays.sort(toAr2);
            System.out.println(Arrays.toString(toAr2));
            if (Arrays.equals(toAr1,toAr2))
                isAnagram = true;




        }
        return isAnagram;
    }


}
