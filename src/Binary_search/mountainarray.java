
public class mountainarray {
    public static void main(String[] args) {


    }
    static int mountain(int[] arr, int target){
        int peak=peak(arr);
        int first_search=bi(arr,target,0,peak);
        if(first_search!=-1)
        {
            return first_search;
        }
        return bi(arr,target,peak+1,arr.length-1);
        
    }
    static int peak(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    static int bi(int[] arr, int target,int start,int end) {
        boolean asc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (asc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}