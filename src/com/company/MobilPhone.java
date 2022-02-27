package com.company;

public class MobilPhone {

        String brand;
        String model;
        boolean onStock = true;


        void onStock(){

        if (onStock)
            System.out.println("The Model of " + brand + "-" + model + " is on stock");
        else {
            onStock = false;
            System.out.println("The Model of " + brand +"-" + model + " is off stock");
        }

        }

        void showAttribute(){

            System.out.println("The " +brand +"-" +model + " can be order or not?");
            if (onStock)
                System.out.println("Is Ready to order");

            else
            System.out.println(" Not Ready");
        }

    public static void main(String[] args) {
        MobilPhone phone = new MobilPhone();
        phone.brand = "IPHONE";
        phone.model = "13 Pro Max";
        System.out.println("Mobil shop nr.21");
        phone.onStock();
        System.out.println("---------");
        phone.showAttribute();
    }

}
