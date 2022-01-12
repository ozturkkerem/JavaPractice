package day35;

public class SquareObject {
    public static void main(String[] args) {

        Square square1 = new Square(4);

        System.out.println(square1);

        square1.setSide(-3);

        System.out.println(square1.getSide());

    }
}
