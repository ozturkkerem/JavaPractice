package day30;

public class Laptop {

    public String brand;
    public int size;
    public String opSystem;
    public String cpu;
    public int ram;


    public void setInfo(String brand, int size, String opSystem, String cpu, int ram) {
        this.brand = brand;
        this.size = size;
        this.opSystem = opSystem;
        this.cpu = cpu;
        this.ram = ram;
    }

    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", opSystem='" + opSystem + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram +
                '}';
    }


}
