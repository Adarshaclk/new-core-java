package com.java.access.external;

public class Nagarahole {
  public Nagarahole(){
      System.out.println("running inside the nagarahole const");
  }

    void frst(){
        System.out.println("running inside the nagarahole default");
    }
    private void frst1(){
        System.out.println("running inside the nagarahole priavte");
    }
    public void frst2(){
        System.out.println("running inside the nagarahole public");
        frst1();
    }
}
