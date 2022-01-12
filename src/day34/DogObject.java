package day34;

public class DogObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog("German", "Silver",'M','B',true);


        dog1.eat();
        dog1.play();

        System.out.println(dog1.numberOfEyes);

    }
}
