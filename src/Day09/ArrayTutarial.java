package Day09;

public class ArrayTutarial {
    public static void main(String[] args) {

         int[] sizes = {43,15, 23, 423, 432, 23, 43, 43, 65, 75, 45, 43, 42, 65,2,34};
        // find the [i]
         for (int i = 0; i < sizes.length; i++){
             if (sizes[i] == 43) {
                 System.out.println("43 found at " + i);
             }
         }
                 // copy the array
                 int count = 0;
                 for (int copyy : sizes) {
                     System.out.println(copyy + " " + count);
                     count++;

                 }

             }
             }