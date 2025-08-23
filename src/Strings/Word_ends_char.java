

public class Word_ends_char {
    public static void main(String[] args) {
        String [] str= "Java code is nice".split(" ");
            int count=0;
            for(int i=0;i<str.length;i++)
            {
                char ch= str[i].charAt(str[i].length()-1);
                if(ch=='e')
                {
                    count++;
                }
            }
        System.out.println(count);
    }
}
