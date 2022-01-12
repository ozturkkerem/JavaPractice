package Day09;
import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        // Get the numbers from user
        System.out.println("Please give three numbers");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        // make the conditions
        if ((n1 == n2)&&(n3 == n1)){
            System.out.println("all equal");
        }
        else if(n1 == n2){
            System.out.println("n1&n2 are equal");
        }
        else if (n2 == n3){
            System.out.println("n2&n3 are equal");
        }
        else if (n3 == n1){
            System.out.println("n3&n1 are equal");
        }
        else{
            System.out.println("none of them are equal");
        }



    }


}
