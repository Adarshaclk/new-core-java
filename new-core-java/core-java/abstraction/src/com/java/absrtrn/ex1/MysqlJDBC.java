package com.java.absrtrn.ex1;


public class MysqlJDBC implements JDBC {
    @Override
    public void save(){
        System.out.println("running inside the MysqlJDBC of save");
    }
}
