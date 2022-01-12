package day32.Truck;

public class Driver {

    public String name;
    public int exp;
    public char type;


    public Driver(String name){

        this.name = name;
    }

    public Driver(String name, int exp){

        this(name);
        this.exp = exp;
    }

    public Driver (String name, int exp, char type){
        this(name,exp);
        this.type=type;
    }


    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", exp=" + exp +
                ", type=" + type +
                '}';
    }
}
