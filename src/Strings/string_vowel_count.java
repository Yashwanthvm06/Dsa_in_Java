

public class string_vowel_count {
    public static void main(String[] args) {
        String sb = new String("Hello World");
        int vocount=0;
        int concount=0;
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            if(Character.isLetter(ch))
            {if("AEIOUaeiou".indexOf(ch)!=-1)
            {
                vocount++;
            }
            else{
                concount++;
            }
        }
        }
        System.out.println("Vowels: "+vocount);
        System.out.println("Consonants : "+concount);
    }
}
