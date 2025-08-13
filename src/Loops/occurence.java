import java.util.Scanner;
public class occurence {
    public static void main(String[] args) {
        Scanner yay = new Scanner(System.in);
        int n =yay.nextInt();
        System.out.println("which is need to search");
        int searching = yay.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==searching)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
