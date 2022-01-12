package Day07;
import java.util.Scanner;

public class Ternaries {
    public static void main(String[] args) {

        System.out.println("Please enter the test result");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        char grade = 'x';


             grade = (score >= 90) ? 'A' :( score >= 70) ? 'B' : (score >= 50) ? 'C' : 'D';

             System.out.println(grade);
         }

}
