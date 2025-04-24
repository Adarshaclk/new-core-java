package com.java.abstrn.loose.internal;

import com.java.abstrn.loose.external.Cars;

public class VolvCls {
    private Cars car;

    VolvCls(Cars car){
        this.car=car;
        System.out.println("running in no cont volvocls");
    }

    public void speed(){
        if(car!=null){
            this.car.service();
        }
        else {
            System.out.println("null values are occures");
        }
    }
}
