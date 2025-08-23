

public class Stblr_shift1pos_of_char {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("xyz");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            if(ch>='a' && ch<='z') {
                if (ch == 'z') {
                    ch = 'a';
                } else {
                    ch = (char) (ch + 1);
                }
            }
                else if(ch>='A' && ch<='Z'){
                    if(ch=='Z'){
                        ch='A';
                    }
                    else{
                        ch=(char)(ch+1);
                    }
                }
                res.append(ch);
        }
        System.out.println(res);
    }
}
