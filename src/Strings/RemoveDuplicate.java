

public class RemoveDuplicate {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Programming");
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            for (int j = i + 1; j < sb.length(); j++) {
                if (ch == Character.toLowerCase(sb.charAt(j))) {
                    sb.delete(j, j + 1);
                    j--;
                }
            }
        }
        System.out.println(sb);
    }
}
