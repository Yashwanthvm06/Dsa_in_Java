package Strings;

public class togglecase {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("JaVa");
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (Character.isUpperCase(ch)) {
                sb.setCharAt(i,Character.toLowerCase(ch));
            } else {
                sb.setCharAt(i,Character.toUpperCase(ch));
            }
        }
        System.out.println(sb);
    }
}
