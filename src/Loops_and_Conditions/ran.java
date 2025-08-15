import java.util.*;
public class ran {
    public static void main(String[] args) {
        Random r1 = new Random();
        int num = r1.nextInt(20)+1;
        Scanner sc = new Scanner(System.in);
        int gue;
        do {
            System.out.print("enter the number : ");
            gue = sc.nextInt();
            if (gue == num) {
                System.out.println("you guessed correct number🥳🥳🥳🥳🥳🥳🥳🥳");
            }
            else if(gue<num){
                System.out.println("guessed smaller number 🤏🤏🤏🤏🤏🤏🤏🤏🤏");
            }
            else {
                System.out.println("guessed is greater :💀💀💀💀💀💀💀💀");
            }
        } while (gue!=num);
    }
}