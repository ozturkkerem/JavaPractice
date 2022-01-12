package Day16;

import java.util.Scanner;

public class Cat_Dog {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the first sentences: ");
        String sen1 = scan.nextLine();
        String word1 = "cat";
        String word2 = "dog";
        int countCat = 0;
        int countDog = 0;
        int lenSen1= sen1.length();
scan.close();
        for (int i = 0; i <= lenSen1-word1.length(); i++)
        {
            if (sen1.substring(i,i+(word1.length())).equalsIgnoreCase(word1))
                countCat++;
            else if (sen1.substring(i,i+word2.length()).equalsIgnoreCase(word2))
            countDog++;

        }
        boolean ifEqual = countCat == countDog;
        System.out.println(ifEqual);



    }

}
