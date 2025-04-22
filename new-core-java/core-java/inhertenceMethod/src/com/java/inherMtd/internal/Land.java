package com.java.inherMtd.internal;

class Land {
    private String owner;
    private int survey;
    protected Land(String owner,int survey) {
        this.owner=owner;
        this.survey=survey;
        System.out.println("running inside the Land CONST");
    }

    public void property() {
        System.out.println("running inside the property method");
    }
}
