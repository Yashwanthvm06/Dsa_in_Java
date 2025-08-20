
public class ordarsearch {
    public static void main(String[] args) {
        int[] arr = {19,18,12,11,10,6,5,4,3,2,10,-12};
        int target = 5;
        int ans = bi(arr,target);
        System.out.println(ans);
    }

    static int bi(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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