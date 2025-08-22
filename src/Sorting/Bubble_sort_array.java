import java.util.Arrays;

public class Bubble_sort_array {
    public static void main(String[] args) {
        int [] arr={1,-4,6,4,8,9,0};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int [] sort(int []arr){

        for(int i=0;i<arr.length;i++) {
            boolean already_sorted=true;
            for (int j = 1; j < arr.length - i; j++)
            //for(int j=1;j< arr.length-i;j++){ can also bee used
            {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    already_sorted = false;
                }
            }
            if (already_sorted) {
                break;
            }
        }
        return arr;
    }
}
