package com.java.inherMtd.internal;
class DigitalCalendor extends Calendor {
    public DigitalCalendor() {
        System.out.println("running inside the DigitalCalendor CONST");
    }

    public void setReminder() {
        System.out.println("running inside the setReminder method");
    }

    @Override
    public void showDate() {
        System.out.println("overridden showDate method in DigitalCalendor");
    }
}