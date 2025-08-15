import java.util.*;
public class check_special {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the char: ");
        char ch=sc.next().charAt(0);
        if(Character.isLetter(ch))
        {
            System.out.println("the character is letter");
        }
        else if(Character.isDigit(ch)){
            System.out.println("the character is ");
        }
        else{
            System.out.println("Special Character");
        }
    }
}
