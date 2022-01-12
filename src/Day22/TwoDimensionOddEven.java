package Day22;

public class TwoDimensionOddEven {
    public static void main(String[] args) {

        int[][] numbers2D = {{1, 4, 5, 7, 97, 4, 4, 13, 534, 754, 7, 87, 90, 876, 4545, 42,}, {10, 32, 409, 583, 400, 12, 9, 1092}};
        int odd = 0;
        int even = 0;
        for (int[] each : numbers2D) {


            for (int element : each) {
                if (element % 2 == 0)
                    even += element;
                else
                    odd += element;


            }

        }
        System.out.println("even: " + even + "\nodd" + odd);
    }
}
