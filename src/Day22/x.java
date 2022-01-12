package Day22;

import java.util.Arrays;

public class x {
    public static void main(String[] args) {


        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ;
        System.out.println(createPhoneNumber(numbers));

    }
    public static String createPhoneNumber(int[] numbers) {
    String phone = "(";
    int i = 0;
        for (int element: numbers) {
            i++;
            phone += element;
            if (i==3)                    //(123) 456-7890
                phone += ") ";
            if (i==6)
                phone += "-";

        }
        //System.out.println(phone);
        return phone;


    }

}
