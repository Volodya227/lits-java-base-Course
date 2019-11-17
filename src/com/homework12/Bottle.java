package com.homework12;

import com.lits.homework5.Object;

public class Bottle<T extends Liquid> {
    private T liquid;

    Bottle(T liquid) {
        this.liquid = liquid;
    }

    String whatInside() {
        return liquid.type;
    }
}
