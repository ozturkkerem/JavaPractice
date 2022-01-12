package day33;

public class IphoneObject {
    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("iPhone 5", "black", 1000,5.0);

        iphone1.faceTime("kerem@dsfsd.com");
        iphone1.faceTime(123141244);
        iphone1.call(213412);
        iphone1.text(421412);

        System.out.println(iphone1);

    }
}
