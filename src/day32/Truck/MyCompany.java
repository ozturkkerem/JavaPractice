package day32.Truck;

public class MyCompany {
    public static void main(String[] args) {


        Driver driver1 = new Driver("Mick",5,'A');
        Driver driver2 = new Driver("john",4,'B');
        Driver driver3 = new Driver("Karly",6,'A');
        Driver driver4= new Driver("Cay" , 7,'A');

        Driver [] drivers = {driver2,driver3,driver4};

        Company company1 = new Company("Kerem","Alex","Josef");

       company1.addDriver(drivers);


        System.out.println(company1);

    }

}
