

public class Sblr_Capitilize_Word {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("java is fun");
        sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
        for(int i=1;i<sb.length();i++)
        {
            if(sb.charAt(i-1)==' ' && Character.isLetter(sb.charAt(i))){
                sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
            }
        }
        System.out.println(sb);
    }
}
