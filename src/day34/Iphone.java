package day34;

public class Iphone {


    public String model,color;
    public double price, size;


    public static String brand, oS, madeIn, designedIn;
    public static boolean isSmartPhone;

    public Iphone(String model, String color, double price, double size) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    static {

        brand = "Iphone";
        oS = "IOS";
        madeIn = "China";
        designedIn = "USA";
        isSmartPhone = true;


    }

    public void printOperatingSystem(){

        System.out.println(oS);

    }

    public long call(long phoneNumber){

        System.out.println(phoneNumber);
    return phoneNumber;
    }

    public long text (long phoneNumber){
        System.out.println(phoneNumber);
        return phoneNumber;

    }


    public long faceTime (long phoneNumber){
        System.out.println(phoneNumber);
        return phoneNumber;

    }

    public String faceTime (String email){
        System.out.println(email);
        return email;

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
1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()



 */