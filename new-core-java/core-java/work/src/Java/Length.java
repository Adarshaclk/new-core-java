package Java;

public class Length {
    public static void main(String[] args) {

        String name = "Adarsh";
        String reversed = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }

        System.out.println("Reversed string is: " + reversed);

        StringBuilder sb = new StringBuilder(name);
        System.out.println("Reversed using StringBuilder: " + sb.reverse());
    }
}


