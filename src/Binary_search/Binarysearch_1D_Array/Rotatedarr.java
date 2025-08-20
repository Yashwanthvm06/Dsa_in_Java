//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1695460907/
public class Rotatedarr {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(finpivot(arr));
    }

    public int search(int[] arr, int target) {
        int pivot = finpivot(arr);
        if (pivot == -1)//if pivot not found then arr is already sorted in asc form and not rotated
        {
            return binarysearch(arr, target, 0, arr.length - 1);
        }
//if target is pivot then return
        if (arr[pivot] == target) {
            return pivot;
        }
        //if start is less than target then then we can know its acs so reduced upto pivot-1
        if (arr[0] <= target) {
            return binarysearch(arr, target, 0, pivot - 1);
        }
        //then lastly the target is less tahn start then the elements are behinf pivot so start after pivot end till arrray
        return binarysearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int finpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (start < mid && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            } else if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid + 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
