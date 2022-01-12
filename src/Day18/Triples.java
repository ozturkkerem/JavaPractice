package Day18;
public class Triples {
    public static void main(String[] args) {


        String str = "xxxabyyyycd";


        int count = 0;
        int tri = 0;


        for (int i = 0; i < str.length(); i++) {

            // Counting occurrences of s[i]

            while (i + 2 < str.length()
                    && str.charAt(i)
                    == str.charAt(i + 1)&&str.charAt(i+1) == str.charAt(i + 2)) {
                i++;
                count++;
              tri = count;
            }
          ;
        }

        System.out.println(tri);;

    }
}

