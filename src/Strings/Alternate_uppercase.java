package Strings;

public class Alternate_uppercase {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<sb.length();i++)
        {
            if(i%2==0)
            {
                sb2.append(Character.toUpperCase(sb.charAt(i)));
            }
            else {
                sb2.append(sb.charAt(i));
            }
        }
        System.out.println(sb2);
    }
}
