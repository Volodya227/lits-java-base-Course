package com.homework12;

public class Main {
    public static void main(String[] args) {
        Bottle cola = new Bottle(Liquid.COLA);
        System.out.println(cola.whatInside());
        Bottle pepsi = new Bottle(Liquid.PEPSI);
        System.out.println(pepsi.whatInside());
        stackOverflow();
    }

    static void stackOverflow() {
        stackOverflow();
    }
}
