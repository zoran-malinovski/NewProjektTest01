package com.company;

public class UnderClass01 extends MobilPhone{

    public static void main(String[] args) {
        MobilPhone phone = new MobilPhone();
        phone.brand = "Samsung";
        phone.model = "13 21";
        System.out.println("Mobil shop nr.001");
        phone.onStock();
        System.out.println("---------");
        phone.showAttribute();
    }

}
