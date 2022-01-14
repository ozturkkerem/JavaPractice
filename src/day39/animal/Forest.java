package day39.animal;

public class Forest {
    public static void main(String[] args) {

        Cat cat = new Cat("sahin","tekir","small","grey",2,'F');
        Dog dog = new Dog("saldir","Sivas Kangal","Large","Kream",4,'F');
        Tiger tiger = new Tiger("Lea","African","Large","Black",3,'F');
        Eagle eagle = new Eagle("uc","evcil","Large","Brown",3,'M');


        cat.eat();
        dog.eat();
        tiger.eat();
        eagle.eat();
        System.out.println(eagle.color);



    }
}
