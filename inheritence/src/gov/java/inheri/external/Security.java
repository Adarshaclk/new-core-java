package gov.java.inheri.external;

import gov.java.inheri.internal.Lock;

public class Security extends Lock {
    protected Security(){
        System.out.println(" security");
    }
    void secure(){
        Lock lock=new Security();
    }
}
