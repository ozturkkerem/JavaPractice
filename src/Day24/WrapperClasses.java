package Day24;

public class WrapperClasses {
    public static void main(String[] args) {

        byte a = 10;
        short b = 20;
        int c = 30;

        //auto boxing    primitive type to object
        Byte x = a;
        Short y = b;
        Integer z = c;

        //out boxing     object type to primitive
        byte q = x;

        //parse methods: converting string to the primitive
        String str = "123";
        int num1 = Integer.parseInt(str);

        //valueOf method: converting string to the wrapped class  object, return wrapper class

        String str2 = "1.5";

        Double e = Double.valueOf(str2);


    }
}
