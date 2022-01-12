package Day18;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "aabcccd";
        String noDuplicate = "";
        String result = "";
        int count = 0;


        //delete the duplicate first
        for (int m = 0; m <= str.length()-1; m++)
        {
            String ch ="" + str.charAt(m);
            if (noDuplicate.contains(ch))
                continue;
            else noDuplicate += ch;

        }


        // find the frequency
        for (int j = 0; j <= noDuplicate.length()-1; j++) {
            for (int i = 0; i <= str.length() - 1; i++) {

                if (noDuplicate.charAt(j) == str.charAt(i))
                    count++;



            }

            result += ""+ noDuplicate.charAt(j) + count;
            count = 0;
        }
        System.out.println(result);
    }
}
