package com.java.absrtrn.ex2;

public class Kashi {
    Ganga yamuna;

    Kashi(Ganga yamuna) {
        System.out.println("running inside const ganga");
        this.yamuna = yamuna;
    }

    public void maa() {
        if (yamuna != null) {
            this.yamuna.river();
        } else {
            System.out.println("null values occures");

        }
    }

}