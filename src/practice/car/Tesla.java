package practice.car;

public class Tesla extends Car {

    public Tesla(String brand, String model, String color, int year, int miles, double price) {
        super(brand, model, color, year, miles, price);
    }

    void autoPilot(){
        System.out.println(brand + " is autopiloting");
    }



}


/*
           extra methods:
                    autoPilot();
 */