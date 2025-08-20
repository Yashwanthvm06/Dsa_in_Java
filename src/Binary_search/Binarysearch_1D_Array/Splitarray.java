
public class Splitarray {
    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        int res=splitarray(arr,2);
        System.out.println(res);
    }
    public static  int splitarray(int[] arr, int am) {
        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);//cause the start willl be the min value
            // that is the single maximum element of arr
            end += arr[i];//cause the end is the maximum sum taht is the sum of the array
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            for (int nums : arr) {
                    if (sum + nums > mid)//element exces the max value
                {
                    sum = nums;//start after the old array
                    pieces++;//the count of the subarray
                } else {
                    sum += nums;
                }
            }
            if (pieces > am) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}

