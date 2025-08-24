package List.ArrayList;

import java.util.Arrays;
public class sort {
    public static void main(String[] args) {
        int [] arr={12,9,5,1,4};
        System.out.println(Arrays.toString(bubble(arr)));
        System.out.println(Arrays.toString(selection(arr)));

    }

    public static int [] bubble(int [] arr){
        for(int i=0;i<arr.length;i++){
            boolean issorted=false;
            for(int j=1;j< arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    issorted=true;
                }
            }
            if(!issorted){
                break;
            }
        }
        return arr;
    }
    public static int [] selection(int [] arr){
        for(int i=0;i<arr.length;i++){
            int last= arr.length-i-1;
            int maxyy=maxele(arr,0,last);
            swap(arr,maxyy,last);
        }
    return arr;
    }
    public static int maxele(int[] arr,int start,int last){
        int maxe=start;
        for(int i=start;i<=last;i++){
            if(arr[maxe]<arr[i]){
                maxe=i;
            }
        }
        return maxe;
    }
    public static void swap(int [] arr,int max,int last){
            int temp=arr[max];
            arr[max]=arr[last];
            arr[last]=temp;
    }

}
