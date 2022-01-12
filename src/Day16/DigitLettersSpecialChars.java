package Day16;

public class DigitLettersSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo12345School!@%^#$WoodenSpoon";

        int length = str.length()-1;
        String letters = "";
        String numbers = "";
        String specialChars= "";
        for (int i = 0; i <= length; i++)
        {
            char ch = str.charAt(i);
            if (ch >= 65 &&  ch <= 90 ){

                letters += ""+ ch;
               // System.out.println(letters);
            }
            else if (ch>= 97 &&  ch<= 122 ){

                letters += ""+ ch;
                //System.out.println(letters);
            }


            else if (ch>= 48 &&  ch <= 57 )
            {
                numbers += ""+ ch;
                //System.out.println(letters);
            }

            else {
                specialChars += ""+ ch;
                //System.out.println(specialChars);
            }

        }

        System.out.println(letters);
        System.out.println(numbers);
        System.out.println(specialChars);

    }
}
