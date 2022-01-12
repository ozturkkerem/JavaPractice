package Day06;
import java.util.Scanner;

public class IdentifyNumber {


    public static void main(String[] args) {

        System.out.println("Please write a number me to check it! ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >0 ){
        boolean positive= number > 0;
            System.out.println(number + " is positive number: " + positive );
        }
        else if(number < 0){
            System.out.println(number + " is negative number: false");
        }

        else{
            System.out.println(number + " is zero: false");
        }


    }

}
