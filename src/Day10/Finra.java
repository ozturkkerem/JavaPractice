package Day10;
import java.util.Scanner;
public class Finra {
    public static void main(String[] args) {

        System.out.println("Print give a positive number ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number >= 1){
            if ((number % 3 == 0 ) && (number % 5 == 0)){
                System.out.println("FINRA");
            }else if(number % 3 == 0 ){
                System.out.println("FIN");
            }else if (number % 5 == 0){
                System.out.println("RA");
            }else{
                System.out.println("Valid number");
            }




        }
        else {
            System.out.println("The number is valid");
        }




    }
}
