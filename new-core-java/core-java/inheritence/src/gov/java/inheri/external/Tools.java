package gov.java.inheri.external;

import gov.java.inheri.internal.Gun;
import gov.java.inheri.internal.Revolver;

public class Tools extends Gun {
    protected Tools(){
        System.out.println(", Weapon is tool");
    }
    void tls(){
        Revolver revolver=new Tools();
    }
}
