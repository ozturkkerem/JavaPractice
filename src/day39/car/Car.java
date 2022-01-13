package day39.car;

public class Car {

    String brand, model, color;
    int year,miles;
    double price;

    public Car(String brand, String model, String color, int year, int miles, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.miles = miles;
        this.price = price;
    }

    void start(){
        System.out.println(brand+" "+ model+" car is starting ");
    }

    void drive(){
        System.out.println(brand+" "+model+" car is being drive");
    }

    @Override
    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", miles=" + miles +
                ", price=" + price +
                '}';
    }
}
/*
carTask:
    Create a class called Car
        instance variables:
            brand, model, year, price, color, miles

            add a constructor to set all the fields

        instance methods:
            start(), drive(),toString()

    Create the following sub classes of Car:
        1. Toyota:
                extra methods:
                    reliable()

        2. BMW:
                extra methods:
                    breaksDown()
                    racing()

        3. Tesla:
                extra methods:
                    autoPilot();
                    /*
 */