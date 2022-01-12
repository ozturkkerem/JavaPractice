package Day13;

import java.util.Scanner;

public class CheckEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email address");
        String email = "kerere@asd.com";

        int index = email.indexOf("@")+1 ;
        int indexEnd = email.lastIndexOf(".");
        String onlyEmail = email.substring(index,indexEnd );
        System.out.println(onlyEmail);
scan.close();
        System.out.println("------------------------------------------");

        String str1 = "Java is fun, Java is cool";
        String s1 = str1.substring(0,11);
        String s2 = str1.substring(13);
        System.out.println(s1);
        System.out.println(s2);


    }


}
