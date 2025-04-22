package Java;
public class Number {
    public static void main(String[] args) {
        String sentence = "Hello, this is a simple Java program";
        String[] words = sentence.trim().split("\\s+");

        int wordCount = words.length;
        System.out.println("Number of words: " + wordCount);
    }
}
