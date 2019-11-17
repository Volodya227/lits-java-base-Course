package com.homework12;

enum Liquid {
    COLA(1, "cola"),
    PEPSI(2, "pepsi"),
    FANTA(2, "pepsi"),
    SPRITE(2, "pepsi");
    String type;
    int id;

    Liquid(int id, String type) {
        this.id = id;
        this.type = type;
    }
}
