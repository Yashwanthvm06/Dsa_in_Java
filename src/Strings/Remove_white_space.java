package Strings;

public class Remove_white_space {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello World Java");
        for(int i=0;i<sb.length();i++)
        {
            if(Character.isWhitespace(sb.charAt(i)))
            {
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);
    }
}
