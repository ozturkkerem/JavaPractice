package day36;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
        setNumberOfCheeseTopping(numberOfCheeseTopping);

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!(size.equalsIgnoreCase("small")||size.equalsIgnoreCase("medium")||size.equalsIgnoreCase("large")))
            return;

        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (size.equals("small") && numberOfCheeseTopping>3)
            return;
        if (size.equals("medium") && numberOfCheeseTopping>4)
            return;
        if (size.equals("large") && numberOfCheeseTopping>5)
            return;


        this.numberOfCheeseTopping = numberOfCheeseTopping;

    }

    public int getNumberOfPepperoniTopping() {



        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (size.equals("small") && numberOfPepperoniTopping>3)
            return;
        if (size.equals("medium") && numberOfPepperoniTopping>4)
            return;
        if (size.equals("large") && numberOfPepperoniTopping>5)
            return;


        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calcCost(){
    int result;

    result = (size.equalsIgnoreCase("small"))?10 :(size.equalsIgnoreCase("medium"))? 12:14;

    result += (numberOfCheeseTopping+numberOfCheeseTopping)*2;

    return result;

    }






    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ",  Cost =" + calcCost() +
                '}';
    }
}

/*
                    S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
5. Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


		Pizza cost is determined by:

 */
