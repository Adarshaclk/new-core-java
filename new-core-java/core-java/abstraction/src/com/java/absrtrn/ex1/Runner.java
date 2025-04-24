package com.java.absrtrn.ex1;

public class Runner {
    public static void main(String[] args) {

        JDBC jdbc=new MysqlJDBC();
        jdbc.save();
        JDBC jdbc1=new OracleJDBC();
        jdbc1.save();
    }

}
