package Day18;

public class  UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String noDub = "";
        String uniq = "";

        for (int i = 0; i <= str.length()-1; i++) {

            String ch = "" + str.charAt(i);

            if (noDub.contains(ch))
                continue;
            else
                noDub += ch;
        }

        int count = 0;
        for (int j = 0; j <= noDub.length()-1; j++) {
            for (int i = 0; i <str.length() ; i++) {
            String ch2 = ""+noDub.charAt(j);
            if (str.charAt(i)==noDub.charAt(j)){

                count++;


            }

            if (count == 1){

                uniq+=""+j;

            }

                count =0;
            }


        }
        System.out.println(uniq);

    }
}
