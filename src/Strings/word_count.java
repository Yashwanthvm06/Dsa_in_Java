

public class word_count {
    public static void main(String[] args) {
        String s1=new String("Java is fun");
         String [] word=s1.split("\\s+");
        System.out.println("word length: "+word.length);
    }
}
