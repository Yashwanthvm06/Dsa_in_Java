package List.ArrayList;

import java.util.*;

public class Remove_Duplicates_sort {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 values including the duplicated values : ");
        for(int i=0;i<5;i++){
            int num=sc.nextInt();
            if(!nums.contains(num)){
                nums.add(num);
            }
            else{
                System.out.print("Already in List so it will not be added");
            }
        }
        Collections.sort(nums);
        System.out.println("After removing and sorting duplicates: " + nums);
    }
}
