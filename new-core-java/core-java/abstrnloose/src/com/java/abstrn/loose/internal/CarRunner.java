package com.java.abstrn.loose.internal;

import com.java.abstrn.loose.external.BMW;
import com.java.abstrn.loose.external.Cars;

public class CarRunner {
    public static void main(String[] args) {
        Cars cars=new BMW();
        VolvCls volvCls=new VolvCls(cars);
        volvCls.speed();

        Cars cars1=new Benz();
        VolvCls volvCls1=new VolvCls(cars1);
        volvCls1.speed();

    }

}
