package Day22;

public class isPangram {
    public static void main(String[] args) {

        String str = "The quick brown fox jumps over the lazy dog";

        System.out.println(check(str));


    }
    public static boolean check(String sent){

        sent = sent.toLowerCase();
         int count= 0;
         String alp = "";
        for( int i = 0; i <= sent.length()-1; i++){

            for (char ch = 'a'; ch <= 'z'; ch++)

                if (sent.charAt(i)==ch && !alp.contains(""+ch)){

                alp+=ch;
                    count++;
                }


        }


boolean isalp = (count==26);

        return isalp;
    }
}
