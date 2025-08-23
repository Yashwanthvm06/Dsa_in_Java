

public class url_valid {
    public static void main(String[] args) {
        String s=new String("https://example.com");
        boolean hashttp=s.contains("https")||s.contains("http");
        boolean hasdot=s.contains(".");
        if(hasdot&&hashttp){
            System.out.println("Valid url");
        }
        else {
            System.out.println("Invalid url");
        }
    }
}
