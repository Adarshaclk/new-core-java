package mil.java.casting;

public class Fruit extends Tree{
    protected Fruit(){
        System.out.println("running inside the Fruit const");
    }
    void apple(){
        System.out.println("running inisde the apple");
    }
    @Override
    void leaf(){
        System.out.println("running inside the leaf fruit");
    }
}
