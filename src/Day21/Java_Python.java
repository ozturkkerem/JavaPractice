package Day21;

import java.util.Arrays;

public class Java_Python {
    public static void main(String[] args) {

       String sentences = "6. Write a program that can return the number of appearances of java and python anywhere in the sentence. (similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)";

      String[] sen =sentences.split(" ");
        int countJava = 0;
        int countPython = 0;
      int i = 0;

        for (String name:sen
             ) {
            if (name.equals("java"))
                countJava++;
            else if (name.equals("python"))
                countPython++;

        }
        System.out.println("java: "+ countJava+"  python: " +countPython);

    }
}
