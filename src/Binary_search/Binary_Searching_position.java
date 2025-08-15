public class Searching {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        int target=8;
        int pos=search(arr,target);
        System.out.println("Result: Found at position : "+pos);
    }
    public static int search(int [] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(target==arr[mid])
            {
                return mid+1;
            }
             else if(target<arr[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
