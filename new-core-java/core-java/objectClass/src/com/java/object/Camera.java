package com.java.object;
import java.util.Objects;
public class Camera {

    private String model;
    private int megapixels;
    private boolean isDslr;
    private double price;

    public Camera(String model, int megapixels, boolean isDslr, double price) {
        this.model = model;
        this.megapixels = megapixels;
        this.isDslr = isDslr;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "model='" + model + ", megapixels=" + megapixels +", isDslr=" + isDslr + ", price=" + price  + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Camera) {
            Camera other = (Camera) obj;
            if (Objects.equals(this.model, other.model) &&
                    Objects.equals(this.megapixels, other.megapixels)) {
                System.out.println("Camera is matching..");
                return true;
            }
        }
        return false;
    }
}
