package Java;

public class Charfreq {

        public static void main(String[] args) {

            String str = "hello madam";
            str = str.replace(" ", ""); // Optional: remove spaces

            char[] chars = str.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '0') continue; // Skip already counted characters

                int count = 1;

                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                        chars[j] = '0'; // Mark as counted
                    }
                }

                System.out.println(chars[i] + ": " + count);
            }
        }
    }
