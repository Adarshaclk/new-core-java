package com.java.inherMtd.internal;

public class Tree {
    private int height;
     private boolean fruit;
    Tree(int height,boolean fruit){
        this.height=height;
        this.fruit=fruit;
        System.out.println("running inisde the tree onst");
    }
    void tree(){
        System.out.println("running inside the tree ");
    }

    @Override
    public String toString() {
        return "Tree{" +"height=" + height + ", fruit=" + fruit + '}';
    }
}
