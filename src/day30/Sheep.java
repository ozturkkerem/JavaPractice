package day30;

public class Sheep {

    public static void main(String[] args) {
//                            0         1       2       3         4       5         6       7
        String [] array = {"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"};  //   (YOU ARE HERE AT THE FRONT OF THE QUEUE)
                      //       7         6        5        4        3                2      1}

        //Your code)))
        String result = "";
        int indexOfWolf = 0;


        for(int i = 0;i < array.length ; i++){

            if(array[i].equals("wolf"))

                indexOfWolf = i;


        }

        int inFrontOfWolf = array.length-indexOfWolf-1;
        if (indexOfWolf < array.length-1)
            result = "Oi! Sheep number " + inFrontOfWolf   +"! You are about to be eaten by a wolf!";
        else
            result = "Pls go away and stop eating my sheep";


        System.out.println(result);


    }

}


