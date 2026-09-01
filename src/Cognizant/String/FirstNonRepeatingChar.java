package Cognizant.String;

public class FirstNonRepeatingChar {
        public char nonRepeatingChar(String s) {

            int n = s.length();

            for (int i = 0; i < n; i++) {
                boolean found = false;

                for (int j = 0; j < n; j++) {
                    if (i != j && s.charAt(i) == s.charAt(j)) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    return s.charAt(i);
                }
            }

            return '$';
        }

    public static void main(String[] args) {
            FirstNonRepeatingChar obj = new FirstNonRepeatingChar();
            String s = "aabbcdaabb";
            char result = obj.nonRepeatingChar(s);
        System.out.println("First Non Repeating Character:  " + result);

    }
    }
