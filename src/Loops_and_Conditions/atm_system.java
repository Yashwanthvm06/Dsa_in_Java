import java.util.*;
public class atm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        short cas;
        int bal= 1000;
        do{
            System.out.println("--- ATM menu ---");
            System.out.println("""
                1. Check Balance
                2. Deposit
                3. Withdraw 
                4. Exit""");
            System.out.print("choose: ");
            cas=sc.nextShort();
            switch(cas)
            {
                case 1:
                    System.out.println("Balance: "+bal);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    float deposit=sc.nextFloat();
                    bal+=deposit;
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: ");
                    float withdraw=sc.nextFloat();
                    bal-=withdraw;
                    break;
                case 4:
                    System.out.println("Thank you. Exiting ");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }while(cas!=4);
    }

}
