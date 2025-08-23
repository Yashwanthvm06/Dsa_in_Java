

public class Sbr_freq_word {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("aabbcc");
        int[] freq=new int[26];
        for(int i=0;i<sb.length();i++)
        {
            char ch= sb.charAt(i);
            freq[ch-'a']++;
        }
        System.out.println(freq[1]);
        for(int j=0;j<26;j++) {
            if (freq[j] > 0) {
                System.out.println((char)(j+'a') +" "+ freq[j]);
            }
        }
    }
}
