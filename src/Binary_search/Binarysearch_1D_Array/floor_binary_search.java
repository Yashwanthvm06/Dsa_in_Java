
public class floor_binary_search {
    public static void main(String[] args) {
        int [] arr={-16,0,2,3,4,15,16,18};
        int tar=12;
        int ans = floorfind(arr, tar);
        System.out.println(ans);
    }
    static int floorfind(int [] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
