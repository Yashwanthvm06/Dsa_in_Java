import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr={5,4,2,1,3};
        System.out.println(Arrays.toString(Sort(arr)));
    }
    public static int[] Sort(int[] arr){
        for(int i=0;i< arr.length;i++){
            int last= arr.length-i-1;
           int max =max(arr,0,last);
           swap(arr,max,last);
        }
        return arr;
    }
     static int max(int[] arr,int start,int last){
    int maxele=start;
    for(int i=start;i<=last;i++){
        if(arr[maxele]<arr[i]){
            maxele=i;
        }
    }
    return maxele;
    }
    static void swap(int [] arr,int max,int last){
int temp=arr[max];
arr[max]=arr[last];
arr[last]=temp;
    }
}
