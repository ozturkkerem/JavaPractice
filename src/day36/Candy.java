package day36;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;


    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setHasPeanuts(hasPeanuts);
        setQuantity(quantity);
        setPrice(price);


    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
       if (quantity<0){
           return;
       }

        this.quantity = quantity;
    }

   // public double getPrice() {



     //   return price;
    //}

    public String getPrice(){
        String s = price + "";
        s = (price==0)?"free":s;

        return s;
    }





    public void setPrice(double price) {
        if (price<0){
            return;
        }


        this.price = price;
    }

    public boolean setHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }


    public String costCandy(){
        double cost = 0;
        String result = "";
        cost += quantity*price;

        result += cost;

        if (cost == 0){
            result = "free";
        }

        return result;
    }

    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPeanuts=" + hasPeanuts +
                ", cost = " + costCandy()+
                '}';
    }
}

/*
1.1 Create a custom class named Candy
             O   private variables:
              O      brand (String), quantity (int), price (double), hasPeanuts (boolean)

                Encapsulate All the private fields
               O         (price of candy can not be set to negative)
                O        (quantity of candy can not be set to zero or negative)

              0  Add a constructor that allows user to set all the fields when the object is created.
               0         (If the arguments not valid it should not be set to the instances)

                Extra methods:
                    toString():
                        if the price is zero, print "free" instead of 0

        1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy

 */