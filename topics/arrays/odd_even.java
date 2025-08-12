import java.util.*;
public class odd_even {
    public static void main(String[] args) {
        int [] arr={10,15,22,33,40};
        int even=0;
        int odd=0;
        for(int i:arr)
        {
            if(i%2==0)
            {
               even++;
            }
else{
    odd++;
            }
        }
        System.out.println("even: " + even +" " + "odd:" + odd);
    }
}
