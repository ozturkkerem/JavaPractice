package Replit;

import day39.car.Car;

public class Carpet {

    public double width, length, unitPrice, totalPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

        totalPrice = (width+length)*unitPrice;

        if (isPersian){
            totalPrice+= 200;
        }

    }

    public Carpet(){
        width = 300;
        length = 300;
        totalPrice = 200;
        isPersian = false;
    }


}
