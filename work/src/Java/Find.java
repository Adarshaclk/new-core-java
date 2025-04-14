package Java;

public class Find {
    public static void main(String[] args) {
            String sentence = "Java is a powerful programming language";
            String target = "powerful";
            String[] words = sentence.toLowerCase().split("\\s+");
            target = target.toLowerCase();

            boolean found = false;

            for (String word : words) {
                if (word.equals(target)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("The word \"" + target + "\" is present in the sentence.");
            }
            else {
                System.out.println("The word \"" + target + "\" is NOT present in the sentence.");
            }
        }
    }


