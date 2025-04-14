package Java;
public class Freq {

        public static void main(String[] args) {

            String sentence = "adarsh is me , i am adarsh ,my name is adarsh";
            String[] words = sentence.split("\\s+");

            for (int i = 0; i < words.length; i++) {
                int count = 1;

                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        words[j] = "";
                    }
                }
                if (!words[i].equals("")) {
                    System.out.println(words[i] + ": " + count);
                }
            }
        }
    }

