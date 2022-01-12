package Day09;
import  java.util.Scanner;

public class NumberOfDay {
    public static void main(String[] args) {
        System.out.println("Please give a number for months");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (((((((number == 1)||(number == 3))||(number == 5))||(number == 7))||(number == 8))||(number == 10))||(number == 12)){
            System.out.println("31 days");
    }
        else if (((number == 4 || number == 6 ) || number == 9 ) || number == 11){
            System.out.println("30 days");
        }
        else{
            System.out.println("28 days");
        }
}
}
