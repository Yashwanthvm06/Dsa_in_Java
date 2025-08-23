

public class Pallindrome {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("madam");
String str = new StringBuffer(sb).reverse().toString();
if(sb.toString().equals(str)){
        System.out.println("Pallindrome");
    }
else{
    System.out.println("Not pallindrome");
}
}
}
