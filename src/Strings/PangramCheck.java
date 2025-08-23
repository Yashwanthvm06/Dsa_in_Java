

public class PangramCheck {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        if (isPangram(input)) {
            System.out.println("Input: " + input);
            System.out.println("Output: Pangram");
        } else {
            System.out.println("Input: " + input);
            System.out.println("Output: Not Pangram");
        }
    }

    // Method to check pangram
    public static boolean isPangram(String str) {
        str = str.toLowerCase();

        // boolean array of size 26 for each letter
        boolean[] present = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                present[ch - 'a'] = true;
            }
        }

        // check if all 26 letters are present
        for (boolean b : present) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
