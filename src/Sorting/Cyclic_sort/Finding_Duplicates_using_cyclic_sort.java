public class Finding_Duplicates_using_cyclic_sort {
    public static void main(String[] args) {
int [] arr={5,1,2,4,3,3};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int []arr) {
//         int i=0;
//         while(i<arr.length){
//             int correct=arr[i]-1;
//            if(arr[i]<arr.length && arr[i]!=arr[correct]){
//                swap(arr,i,correct);
//            }
//            else{
//                i++;
//            }
//         }
//    for(int j=0;j<arr.length;j++){
//        if(arr[j]!=j+1){
//            return arr[j];
//        }
//    } this can also be done ,but it takes more time and also in duplicated array there my not say the arr value has the arr.length if
//    arr.length is 6 then it's not must to the arr have the value in arr.

        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            }
            else{
                i++; //if values are in correct position [1...n] then check for next index
            }
        }
return -1;
    }
    public static void swap(int [] arr,int f,int s){
    int temp=arr[f];
    arr[f]=arr[s];
    arr[s]=temp;
    }
}
