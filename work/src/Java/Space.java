package Java;

public class Space {
    public static void main(String[] args) {
        String sent = "I love india";
        int space = 0;
        for (int i = 0; i < sent.length(); i++) {
            if (sent.charAt(i) == ' ') {
                space++;
            }

        }
        System.out.println("the number of spaces is "+space);
    }
}
