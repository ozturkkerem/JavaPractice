package Day13;

import java.util.Scanner;

public class Xcode2 {
    public static void main(String[] args) {

        System.out.println("Enter a word");


        Scanner scan = new Scanner(System.in);
        /*
        String word = scan.next(),word1=scan.next();
        scan.close();
        if (word.charAt(0) == 'x')
            System.out.println("a" + word.substring(1));
        else
            System.out.println(word);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String result = word1.replace('x','a');
                String result2 = result.replace('X','a');
        System.out.println(result2);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
*/
        String firstName = scan.next();
        String lastName = scan.next();
        String firstCharOfName = firstName.substring(0,1);
        firstCharOfName = firstCharOfName.toUpperCase();
        String firstCharOfLastName = lastName.substring(0,1);
        firstCharOfName = firstCharOfName.toUpperCase();

        firstName = firstName.toLowerCase();
        firstName = firstCharOfName+firstName.substring(1);
        lastName = lastName.toLowerCase();
        lastName = firstCharOfLastName+lastName.substring(1);
        System.out.println(firstName+" "+lastName);
scan.close();
    }


}
