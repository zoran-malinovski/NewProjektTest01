package com.company;

public class MobilPhone {

        String brand;
        String model;
        boolean onStock = true;


        void onStock(){

        if (onStock)
            System.out.println("The Model of " + brand +"-"+ model + " is on stock");
        else {
            onStock = true;
            System.out.println("The Model of" + model + " is off stock");
        }

        }

    public static void main(String[] args) {
        MobilPhone phone = new MobilPhone();
        phone.brand = "IPHONE";
        phone.model = "13 Pro Max";
        System.out.println("Mobil shop nr.21");
        phone.onStock();
    }

}
