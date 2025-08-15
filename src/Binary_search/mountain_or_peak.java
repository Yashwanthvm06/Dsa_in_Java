
public class mountain_or_peak {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1};
        int peak = peakindex(arr);
        System.out.println(peak);
    }
static int peakindex(int[] arr) {
    int start = 0;
    int end = arr.length-1;
    while (start < end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] > arr[mid + 1]) {
            end = mid;
        } else {
            start = mid + 1;
        }
    }
    return start;
}
}

