package com.java.object;

public class USBRunner
{
    public static void main(String[] args) {

        USB u1 = new USB("SanDisk", 64, "Type-C", true);
        USB u2 = new USB("Kingston", 32, "Type-A", false);
        USB u3 = new USB("Kingston", 32, "Type-A", false);

        System.out.println("USB 1: " + u1);
        System.out.println("USB 2: " + u2);
        System.out.println("USB 3: " + u3);

        boolean uMatch = u2.equals(u3);
        boolean uNotMatch = u1.equals(u2);
        System.out.println("USB match: " + uMatch);
        System.out.println("USB not match: " + uNotMatch);
    }
}
