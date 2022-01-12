package Day06;
import java.util.Scanner;

public class IfStatetmentGrades {

    public static void main(String[] args) {

        System.out.println("Please write test score: ");

        Scanner sc = new Scanner(System.in);
        int testResult = sc.nextInt();
        char grade;
        if (testResult >= 90)
        {
            grade = 'A';
        }else if (testResult < 90 && testResult >= 70) {

            grade = 'B';

        } else if (testResult < 70 && testResult > 50) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("grade = " + grade);

        //char grade2 = (testResult >= 90)? 'A' :(testResult >= 70)? 'B' :(testResult > 50)? 'C' : 'F';
        char grade2 = (testResult >= 90)? 'A' :(testResult >= 70)? 'B' :(testResult > 50)? 'C' : 'F';
        System.out.println("grade2 = " + grade2);
    }

}