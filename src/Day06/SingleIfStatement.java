package Day06;

import java.util.Scanner;

public class SingleIfStatement {

    public static void main(String[] args) {

        int score = 45;
        System.out.println("What is the student's test result: ");
        Scanner sc = new Scanner(System.in);


        int testResult = sc.nextInt();

        if (testResult >= score){

            System.out.println("Congratulations on passing your exam!");
        }

        else{
            System.out.println("Sorry you are fail");
        }


    }
}
