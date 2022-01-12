package Day21;

public class CommonElements {
    public static void main(String[] args) {

        int [] arr1= {1,2,3,4,5};
        int [] arr2= {4,5,6,7,8};

        int i = 0;
        for (int each:arr1
             ) {

            for (int each2:arr2
                 ) {
                if (each==each2)
                    System.out.println(each);
            }

        }


    }
}
