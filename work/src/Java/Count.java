package Java;

public class Count {

        public static void main(String[] args) {
            String sentence = "Java is fun to learn";
            int totalCharacters = sentence.length();

            int charactersWithoutSpaces = sentence.replace(" ", "").length();

            System.out.println("Original sentence: \"" + sentence + "\"");
            System.out.println("Total characters (including spaces): " + totalCharacters);
            System.out.println("Total characters (excluding spaces): " + charactersWithoutSpaces);
        }

}
