package Strings;

public class Remove_digit {
    public static void main(String[] args) {
        String str = new String("abc123xyz45");
        StringBuilder sb=new StringBuilder(str);
//        String result = str.replaceAll("\\d", ""); // \d = any digit
//        System.out.println(result);
        for (int i = 0; i < sb.length(); i++) {
            if(Character.isDigit(sb.charAt(i))){
                sb.delete(i,i+1);
                i--;
            }
        }
        System.out.println(sb);
    }
}
