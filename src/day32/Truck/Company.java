package day32.Truck;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {

    public String manager, accountant, secretary;

    public ArrayList<Driver> driverList = new ArrayList<>();

    public void addDriver(Driver driver){
        driverList.add(driver);
    }

    public void addDriver(Driver[] drivers){

        driverList.addAll(Arrays.asList(drivers));
    }


    public Company(String manager){

        this.manager=manager;

    }

    public Company(String manager, String accountant){
        this(manager);
        this.accountant=accountant;

    }

    public Company(String manager, String accountant, String secretary){

        this(manager,accountant);
        this.secretary=secretary;

    }



    public String toString() {
        return "Company{" +
                "manager='" + manager + '\'' +
                ", accountant='" + accountant + '\'' +
                ", secretary='" + secretary + '\'' +
                ", driverList=" + driverList +
                '}';
    }
}
