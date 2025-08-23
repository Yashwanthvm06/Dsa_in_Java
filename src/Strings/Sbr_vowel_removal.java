

public class Sbr_vowel_removal {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Education");
        for(int i=0;i< sb.length();i++) {
            char ch = sb.charAt(i);
            if (Character.isLetter(ch)) {
                if ("AEIOUaeiou".indexOf(ch)!=-1) {
                    sb.delete(i,i+1);
                    i--;
                }
            }
        }
        System.out.println(sb);
    }
}
