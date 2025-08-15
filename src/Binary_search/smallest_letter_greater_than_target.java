
public class smallest_letter_greater_than_target {
    public static void main(String[] args) {
        char[]arr={'c','f','j','l'};
        char target='z';
        char result=lower(arr,target);
        System.out.println(result);
    }
    static char lower (char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else if (target > letters[mid]) {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
