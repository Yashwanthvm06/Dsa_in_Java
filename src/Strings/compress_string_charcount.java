

public class compress_string_charcount {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("aabcccccaaa");
//        int [] freq=new int[26];
//        for(int i=0;i<sb.length();i++) {
//            char ch = sb.charAt(i);
//            if (ch >= 'a' && ch <= 'z') {
//                freq[ch - 'a']++;
//            }
//        }
//        for(int i=0;i<26;i++)
//        {
//            if(freq[i]>0){
//                System.out.println((char)(i+'a')+"appeared "+freq[i]+"times");
//            }
//        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<sb.length();i++)
        {
            int count=1;
            char ch= sb.charAt(i);
            while(i+1<sb.length() && sb.charAt(i+1)==ch)
            {
                count++;
                i++;
            }
            res.append(ch).append(count);
        }
        System.out.println(res);
    }
}
