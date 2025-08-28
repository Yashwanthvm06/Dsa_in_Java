import java.util.Arrays;

public class FindDuplicate_Missing_CyclicSort {
        public static int[] findErrorNums(int[] nums) {
            int i=0;
            while(i<nums.length){
                int correct=nums[i]-1;
                if(nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }
                else{
                    i++;
                }
            }
            for(int index=0;index<nums.length;index++){
                if(nums[index]!=index+1){
                    return new int []{nums[index],index+1};
                }
            }
            return new int []{-1,-1};
        }
        public static void swap(int []arr,int f ,int s){
            int temp=arr[f];
            arr[f]=arr[s];
            arr[s]=temp;
        }

    public static void main(String[] args) {
            int [] arr={1,1};
            int [] arr2={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
        System.out.println(Arrays.toString(findErrorNums(arr2)));
    }
}
