package com.java.inherMtd.internal;

class Calendor {
    private String type;
    private int year;

    protected Calendor(String type, int year) {
        System.out.println("running inside the Calendor CONST");
        this.type = type;
        this.year = year;
    }

    void setCalendor(String type, int year) {
        this.type = type;
        this.year = year;
    }

    public void showDate() {
        System.out.println("running inside the showDate method");
    }

    @Override
    public String toString() {
        return "Calendor{" + "type='" + type + '\'' + ", year=" + year + '}';
    }
}
