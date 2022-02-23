package com.company;

public class MobilPhone {

        String brand;
        String model;
        boolean onStock = false;


        void onStock(){

        if (onStock)
            System.out.println("The Model of" + brand + " is on stock");
        else {
            onStock = true;
            System.out.println("The Model of" + model + " is off stock");
        }

        }

}
