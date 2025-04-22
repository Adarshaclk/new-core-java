package mil.java.casting;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.leaf();

        Tree tree1=new Fruit();
        tree1.leaf();


        Fruit fruit=(Fruit) tree1;
        fruit.apple();

        Fruit fruit1=new Fruit();
        fruit1.leaf();
        fruit1.apple();


    }
}
