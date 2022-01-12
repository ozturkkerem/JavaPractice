package Day22;

public class TwoDimensionMinMax {
    public static void main(String[] args) {

        int [][] numbers2D = {{3,5,8,5,343,432,4,432,76,8,675,8,786},{1,321,432,5345,346,54765,76586,5456,347,54}};


        int min = numbers2D[0][0];
        int max = numbers2D[0][0];
        for (int[]numbers:numbers2D) {

            for (int element:numbers) {

                if(element<min)
                    min=element;
                if (element>max)
                    max=element;
            }
        }
        System.out.println("Maximum number is: "+max+"\nMinimum number is: "+ min);

    }
}
