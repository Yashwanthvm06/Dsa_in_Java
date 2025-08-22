import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble_selection_sort {
    public static void main(String[] args) {
        int [] via_bubble={1,0,-3,9,-5,10,100};
        System.out.println("Sorting using Bubble sort: "+Arrays.toString(bubble(via_bubble)));
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        int [] via_selection={1,0,-3,9,-5,10,100};
        System.out.println("Sorting using Bubble sort: "+ Arrays.toString(selection(via_selection)));

    }
    public static int [] selection(int [] arr) {
        int passes=0;
        for (int i = 0; i < arr.length-1; i++) {
            passes++;
            int last = arr.length - i - 1;
            int max=maxele(arr,0,last);
            swap(arr,max,last);
            System.out.println("Selection Sort after " + passes + " pass : "+Arrays.toString(arr));
        }
        System.out.println("Total passes for completer sorting in Selection sort : "+passes+" passes");
        return arr;
    }
    static int maxele(int [] arr,int start,int end){
        int maxy=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[maxy]<arr[i]){
                maxy=i;
            }
        }
        return maxy;
    }
    public static void swap(int[] arr, int max, int last){
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
    public  static int[] bubble(int [] arr){
        int passes=0;
        for(int i=0;i<arr.length;i++)
        {
            passes++;
            boolean already_sorted=true;
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    already_sorted=false;
                }
            }
            System.out.println("Bubble Sort after " + passes + " pass : "+Arrays.toString(arr));
            if(already_sorted){
                break;
            }
        }
        System.out.println("Total passes for completer sorting in Bubble sort : "+passes+" passes");
        return arr;
    }
}
