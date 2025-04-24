package com.java.abstrn.loose.internal;

import com.java.abstrn.loose.external.College;

public class Mechcls {
    College college;

    public Mechcls(College college){
        this.college=college;

    }
    public void vtu() {
        if (college != null) {
            this.college.branch();
            System.out.println("not null valuese occures");
        }
        else {
            System.out.println("null values occures");
        }
    }
}
