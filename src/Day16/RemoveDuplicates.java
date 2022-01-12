package Day16;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aaabbaaccc";
        String result = "0";

        int length = str.length() - 1;

        for (int i = 0; i <= length ; i++)
        {
         String ch = ""+str.charAt(i);

         if (!result.contains(ch))
            result +=ch;

        }
        System.out.println(result);






    }
}
