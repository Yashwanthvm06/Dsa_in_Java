import java.util.Arrays;

public class CyclicSort_Array {
    public static void main(String[] args) {
        int[] arr={3,5,4,2,1};
        System.out.println(Arrays.toString(cyc(arr)));
    }
    public static int[] cyc(int [] arr){
        int i=0;
        while(i<arr.length){
            int correct_pos=arr[i]-1;
            if(arr[i]!=arr[correct_pos]){
                swap(arr,i,correct_pos);
            }
            else{
                i++;
            }
        }
    return arr;
    }
    public static void swap(int []arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
