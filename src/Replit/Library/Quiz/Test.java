package Replit.Library.Quiz;

class A {
    public A(){
        System.out.println("A ");
    }
}

class B extends A {
    public  B(){
        System.out.println("B ");
    }
}

public class Test extends B {
    public Test(){
        System.out.println("C ");
    }

    public static void main(String[] args) {
        B obj = new B();
    }


}
