import java.util.Arrays;

public class insertion_sort_using_shifting {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        System.out.println(Arrays.toString(insert(arr)));
    }

    public static int[] insert(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    return arr;
    }
}
