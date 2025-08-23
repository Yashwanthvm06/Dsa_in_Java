

public class Count_of_Substring {
    public static void main(String[] args) {
        String s1="abababab";
        String substring="ab";
        int count=0;
        for(int i=0;i<=s1.length()-substring.length();i++)
        {
                if(s1.substring(i,i+substring.length()).equals(substring)){
                    count++;
                }
        }
        System.out.println(count);
    }
}
