package Day20;
import java.util.Arrays;
import java.util.Scanner;
public class Classmates {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String [] classmates = new String[10];
        System.out.println("Enter 10 of your classmates full name");
        for (int i = 0; i < classmates.length; i++) {
           String x = scan.nextLine();
            classmates[i]= x;

        }

        for (int i = 0; i < classmates.length; i++) {
            System.out.println(classmates[i]);
        }
scan.close();

    }
}
