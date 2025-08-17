package Strings;

public class Replace_space_with_dash {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java Programming Language");
        for(int i=0;i<sb1.length();i++)
        {
            char ch=sb1.charAt(i);
            if(ch==' ')
            {
                sb1.setCharAt(i,'-');
            }
        }
        System.out.println(sb1);
    }
}
