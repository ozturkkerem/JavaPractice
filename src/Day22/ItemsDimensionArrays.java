package Day22;

public class ItemsDimensionArrays {
    public static void main(String[] args) {
        String[][] itemsD2 = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        System.out.println("---------      1        -------");
        for (String[]itemsD1:itemsD2) {
            for (String element :itemsD1) {
                System.out.print(element+"\t");
            }
            System.out.println();
        }
        System.out.println("------------      2       -----------------");

        for (int i = 0; i <= itemsD2.length-1; i++){


            for(int j = itemsD2[i].length-1; j>=0; j-- ){

                System.out.print(itemsD2[i][j]+"\t");
            }
            System.out.println();

        }
        System.out.println("------       3         ----------------");
        for (int i = itemsD2.length-1; i >= 0; i--){

            for (int j = 0; j < itemsD2[i].length; j++) {
                System.out.print(itemsD2[i][j]+"\t");
            }
            System.out.println();

        }







    }
}


