package com.java.abstrn.loose.internal;

import com.java.abstrn.loose.external.Body;

public class Partcls {

    Body body;

    Partcls(Body body){
        this.body=body;
    }

    public void organ(){
        if(body!=null){
            this.body.parts();
            System.out.println("not null values occured");
        }
        else{
            System.out.println("null values are occured");
        }
    }
}
