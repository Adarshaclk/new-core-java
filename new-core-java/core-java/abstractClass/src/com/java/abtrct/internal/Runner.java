package com.java.abtrct.internal;

public class Runner {
    public static void main(String[] args) {
        AbstractBridge abstractBridge=new Bridge();
        abstractBridge.cable();
        Bridge bridge=new Bridge();
        bridge.normal();
        bridge.cable();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        AbstractAssaimt abstractAssaimt=new Assaignment();
        abstractAssaimt.work();
        Assaignment assaignment=new Assaignment();
        assaignment.work();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        AbstractMission abstractMission=new Mission();
        abstractMission.mission();
        abstractMission.miss();
        Mission mission=new Mission();
        mission.mission();
        mission.ko();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        AbstractRoad abstractRoad = new Road("NH-27");
        abstractRoad.nh();
        Road road = new Road("Expressway");
        road.rd();
        road.nh();
        Road copiedRoad = new Road();
        System.out.println("Copy created:");
        copiedRoad.nh();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        AbstractWork abstractWork=new Work();
        abstractWork.cncrtWork1();
        abstractWork.cnctWork();
        abstractWork.work1();
        abstractWork.work2();
        AbstractWork1 abstractWork1=new Work();
        abstractWork1.work3();
    }

}

