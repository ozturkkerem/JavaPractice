package Day16;

import java.util.Scanner;

public class Array_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = 5;
        int[] ages = new int[x];

        for (int i = 0; i <= x-1; i++)
        {
            System.out.println("Enter the age:");
            ages[i] = scan.nextInt();


        }
        System.out.println(ages[1]);  //30
scan.close();
    }
}
