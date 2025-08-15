import java.util.*;
public class discount {
    public static void main(String[] args) {
        System.out.print("Enter age: ");
        Scanner sc=new Scanner(System.in);
        float age=sc.nextFloat();
        System.out.print("Enter amount: ₹");
        float amount=sc.nextFloat();
        if(age>60 && amount>1000)
        {
            float discount=amount/10;
            amount=amount-discount;
            System.out.println("Discount applied: ₹"+discount);
            System.out.println("Final amount: ₹"+amount);
        }
        else{
            System.out.println("No Discount");
        }
    }
}
