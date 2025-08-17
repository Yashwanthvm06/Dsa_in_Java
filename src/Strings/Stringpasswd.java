package Strings;

public class Stringpasswd {
    public static void main(String[] args) {
     String s=new String("Test@123");
     boolean hasupper=false;
        boolean halower=false;
        boolean haspclchar=false;
        boolean hadigit=false;

     for(int i=0;i<s.length();i++)
     {
         char ch=s.charAt(i);
        if(Character.isUpperCase(ch)){
            hasupper=true;
     }
        else if(Character.isLowerCase(ch))
        {
            halower=true;
        }
        else if(Character.isDigit(ch))
        {
            hadigit=true;
        }
        else{
            haspclchar=true;
        }
     }
     if(hasupper && halower && hadigit && haspclchar){
         System.out.println("Strong password");
     }
     else{
         System.out.println("weak password");
     }
    }

}

