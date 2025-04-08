package org.java.encap.external;

import org.java.encap.internal.*;

public class AllRunner {
    public static void main(String[] args) {
        Disorder disorder=new Disorder();
        disorder.dis();
        Genitic genitic=new Genitic();
        genitic.gen();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        SpiderKey spiderKey=new SpiderKey();
        spiderKey.spidy();
        CarKey carKey=new CarKey();
        carKey.car();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Water water=new Water();
        water.wtr();
        Fuel fuel=new Fuel();
        fuel.fuel();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        School school=new School();
        school.scl();
        Miltary miltary=new Miltary();
        miltary.mil();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Speed speed=new Speed();
        speed.spd();
        Normal normal=new Normal();
        normal.nrml();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Business business=new Business();
        business.bns();
        Job job=new Job();
        job.jb();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Russian russian=new Russian();
        russian.rsn();
        USA usa=new USA();
        usa.usa();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Bike bike=new Bike();
        bike.bke();
        Car car=new Car();
        car.car();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Equipment equipment=new Equipment();
        equipment.showDetails();
        Trainer trainer=new Trainer();
        trainer.trainerInfo();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Resident resident=new Resident();
        resident.showApartmentInfo();
        Visitors visitors=new Visitors();
        visitors.viewApartmentDetails();



    }
}
