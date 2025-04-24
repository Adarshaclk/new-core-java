package com.java.abstrn.loose.internal;

import com.java.abstrn.loose.external.Ai;
import com.java.abstrn.loose.external.College;

public class CollegeRunner {
    public static void main(String[] args) {
        College college=new Ai();
        Mechcls mechcls=new Mechcls(college);
        mechcls.vtu();

        College college1=new Cs();
        Mechcls mechcls1=new Mechcls(college1);
        mechcls1.vtu();
    }
}
