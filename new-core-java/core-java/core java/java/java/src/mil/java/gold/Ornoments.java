package mil.java.gold;

import java.util.Objects;

    public class Ornoments {


        public Ornoments(Gold gold){
            System.out.println("running constructrr in ornoments");
            if(Objects.nonNull(gold)){
                gold.ring();
            }
            else{
                System.out.println("null values occures");
            }
        }
        public  void chain(){
            System.out.println("running in chain method in ornoments");
        }
    }
