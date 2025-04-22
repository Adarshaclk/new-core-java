package com.java.inherMtd.internal;
class SteamIron extends IronBox {
    public SteamIron() {
        super("Steam",100);
        System.out.println("running inside the SteamIron CONST");
    }

    public void steam() {
        System.out.println("running inside the steam method");
    }

    @Override
    public void heat() {
        System.out.println("overridden heat method in SteamIron");
    }
}