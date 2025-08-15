
public class searchinrange {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int target = 3;
        int result = searinr(arr,target,1,4);
        System.out.println(result);
    }

    private static int searinr(int[] arr, int target, int start, int end) {
        if(arr.length==0){
            return -1;
        }
        for(int i =start;i<=end;i++){
            int element=arr[i];
            if(element==target){
                return element;
            }
        }
        return -1;
    }
}
