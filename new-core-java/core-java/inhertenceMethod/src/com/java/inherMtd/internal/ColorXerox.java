package com.java.inherMtd.internal;

class ColorXerox extends Xerox {
    public ColorXerox() {
        super("Canon ColorXerox", 5000);
        System.out.println("running inside the ColorXerox CONST");
    }

    public void colorPrint() {
        System.out.println("running inside the colorPrint method");
    }

    @Override
    public void copy() {
        System.out.println("overridden copy method in ColorXerox");
    }
}
