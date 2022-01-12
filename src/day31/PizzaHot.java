package day31;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaHot {
    public static void main(String[] args) {

        System.out.println( new Pizza('S',1,1));

        // create 100 pizza objects: size - 'S',  cheese topping-2, pepperoni topping -3
        // create 100 Pizza Objects: size - 'M', cheese topping-3,  pepperoni topping -4
        //create 100 Pizza Objects: size - 'L', cheese topping-4,  pepperoni topping -5


        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {


            Pizza smallPizza = new Pizza('S',2,3);
            Pizza mediumPizza = new Pizza('M',3,4);
            Pizza largePizza = new Pizza('L',4,5);

        pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));

        }
        System.out.println("Total Number Of Pizza: " + pizzas.size());

        double totalPrice= 0;

        for (Pizza pizza : pizzas) {

            totalPrice+= pizza.calcCost();

        }

        System.out.println("Total Price : $" + totalPrice);

        for (Pizza pizza : pizzas) {

            System.out.println(pizza.size);

        }




    }
}
