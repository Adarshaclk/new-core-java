package com.java.inherMtd.internal;
class MechanicalKeyboard extends Keyboard {
    public MechanicalKeyboard() {
        System.out.println("running inside the MechanicalKeyboard CONST");
    }

    public void clickySound() {
        System.out.println("running inside the clickySound method");
    }

    @Override
    public void type() {
        System.out.println("overridden type method in MechanicalKeyboard");
    }
}