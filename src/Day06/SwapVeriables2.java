package Day06;
import java.util.Scanner;


public class SwapVeriables2 {
    public static void main(String[] args) {

        System.out.println("How old are you?");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        System.out.println("age = " + age);

        switch (age){

            case 30:
                System.out.println("you are around 30");
                break;
            default:
                System.out.println("Sorryyyyyy");


        }
        System.out.println("Are you from east cost or west cost?");
        String fromWhere = sc.next();

        System.out.println("really  " + fromWhere);


    }



}
