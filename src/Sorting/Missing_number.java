import java.util.ArrayList;
import java.util.List;

public class Missing_number {
    public static void main(String[] args) {
int [] arr={4,3,2,7,8,2,3,1};
        System.out.println(sort(arr));
    }
    public static List<Integer> sort(int [] arr){
     int i=0;
     while(i<arr.length){
         int correct=arr[i]-1;
         if(arr[i]<=arr.length && arr[i]!=arr[correct]){
             swap(arr,i,correct);
         }
         else {
             i++;
         }
     }
     List<Integer> ya=new ArrayList<>();
     for(int j=0;j<arr.length;j++){
         if(arr[j]!=j+1){
             ya.add(j+1);
         }
     }
     return ya;
    }
    public static void swap(int []arr,int f,int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
