package com.java.absrtrn.ex1;

public class OracleJDBC implements JDBC {

    @Override
    public void save(){
        System.out.println("running inside the OracleJDBC of save");
    }
}
