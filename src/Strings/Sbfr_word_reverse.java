package Strings;

public class Sbfr_word_reverse {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Java is powerful");
        String []rev=sb.toString().split(" ");
        StringBuffer reved=new StringBuffer();
        for(int i=rev.length-1;i>=0;i--){
               reved.append(rev[i]);
               if(i!=0){
                   reved.append(" ");
               }
        }
        System.out.println(reved);
    }
}
