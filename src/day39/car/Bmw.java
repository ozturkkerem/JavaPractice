package day39.car;

public class Bmw extends Car {

    public Bmw(String brand, String model, String color, int year, int miles, double price) {
        super(brand, model, color, year, miles, price);
    }

    void breaksDown(){

        System.out.println(brand+" is breaking down");

    }


    void racing(){
        System.out.println(brand + " is racing");
    }

}



/*
      2. BMW:
                extra methods:
                    breaksDown()
                    racing()
 */