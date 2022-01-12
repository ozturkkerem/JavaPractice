package day33;

public class Iphone {

    public String model,color;
    public double price, size;

    public static String brand = "iphone";
    public static String OS = "iOS";
    public static String madeIn = "Chine";


    public Iphone(String model, String color, double price, double size) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    public void brand (){
        System.out.println(brand);

    }

    public void faceTime (long phoneNumber) {

        System.out.println(phoneNumber);

    }

    public void faceTime ( String email) {

        System.out.println(email);

    }

    public void call (long phoneNumber){

        System.out.println(phoneNumber);
    }
    public void text (long phoneNumber){

        System.out.println(phoneNumber);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}

/*
4. IPhone Task:
		1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()


 */