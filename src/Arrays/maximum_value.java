
public class maximum_value {
    public static void main(String[] args) {
        int[] arr={23,11,56,89,12,4,77,90,2,14};
        int max=arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
