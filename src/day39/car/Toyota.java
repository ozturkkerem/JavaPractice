package day39.car;

public class Toyota extends Car{
    public Toyota( String model, String color, int year, int miles, double price) {
        super("Toyota", model, color, year, miles, price);
    }


    void reliable(){
        System.out.println(brand+" is reliable");


    }
}
