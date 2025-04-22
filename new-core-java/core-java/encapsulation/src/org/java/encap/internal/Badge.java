package org.java.encap.internal;

public class Badge {
    private String name = "school";
    private int lenght = 4;
    private int width = 2;
    private String matirel = "cloth";
    private boolean smmoth = true;

    public Badge() {
        System.out.println("running inside the Keychain");
    }

    void setName(String name) {
        this.name = name;
    }

    void setLenght(int lenght) {
        this.lenght = lenght;
    }

    void setWidht(int width) {
        this.width = width;
    }

    void setMatirel(String matirel) {
        this.matirel = matirel;
    }

    void setSmmoth(boolean smmoth) {
        this.smmoth = smmoth;
    }

    public String getName() {
        return this.name;
    }

    public int getLenght() {
        return this.lenght;
    }

    public int getWidth() {
        return this.width;
    }

    public String getMatirel() {
        return this.matirel;
    }

    public boolean getSmmoth() {
        return this.smmoth;
    }
}