package Java;

public class Include {
    public static void main(String[] args) {

        String nam = "india is my country , i love my india ";
        for (int i = 0; i < nam.length();i++){
            char c=nam.charAt(i);
            if(c ==' '){
               c='%';
            }
            System.out.print(c);
        }

    }
}
