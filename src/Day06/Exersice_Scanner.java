package Day06;

import java.util.Scanner;

public class Exersice_Scanner {
    public static void main(String[] args) {
        System.out.println("Please write whatever you want: ");
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();
        System.out.println(scanned);

        System.out.println("How old are you? ");
        //Scanner sd = new Scanner(System.in);
        int scanned2 = sc.nextInt();
        System.out.println(scanned2);

    }

}
