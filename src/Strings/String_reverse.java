

public class String_reverse {
    public static void main(String[] args) {
        String s1 = new String("Java Code");
        System.out.println(rev(s1));
    }
public static String rev(String s1)
{char[]ch=s1.toCharArray();
    int start=0;
    for (int i=0;i<=ch.length;i++)
    {
        if(i==ch.length || ch[i]==' '){
            reverword(ch,start,i-1);
            start=i+1;
        }
    }
    return new String(ch);
}
public static void reverword(char[] ch,int start,int end)
{
    while(start<end)
    {
        char temp=ch[start];
        ch[start]=ch[end];
        ch[end]=temp;
        start++;
        end--;
    }
}
}
