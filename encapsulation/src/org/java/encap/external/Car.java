package org.java.encap.external;

import org.java.encap.internal.Garage;

public class Car {


    public Car() {
        System.out.println("running inside the car");
    }

        public void car(){
            Garage garage=new Garage();
        System.out.println("name of the of the garage is " + garage.getName());
        System.out.println("number of bike in the garage is " + garage.getBike());
        System.out.println("number of employee in the garage is " + garage.getEmp());
        System.out.println("location of bike in the garage is " + garage.getLoc());
        System.out.println("is spers of bike in the garage  " + garage.getSper());
    }

}
