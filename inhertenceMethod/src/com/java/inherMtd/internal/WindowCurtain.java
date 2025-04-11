package com.java.inherMtd.internal;
class WindowCurtain extends Curtain {
    public WindowCurtain() {
        System.out.println("running inside the WindowCurtain CONST");
    }

    public void cover() {
        System.out.println("running inside the cover method");
    }

    @Override
    public void fabric() {
        System.out.println("overridden fabric method in WindowCurtain");
    }
}
