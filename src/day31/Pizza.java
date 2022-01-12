package day31;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;


    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calcCost(){

        int startingPizzaCost = (size == 'S') ? 10 : (size == 'M') ? 12 : 14;

        int pizzaCost = startingPizzaCost + (numberOfCheeseTopping+numberOfPepperoniTopping) * 2;


        return pizzaCost;

    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", Cost of Pizza =" + calcCost() +
                '}';
    }
}
