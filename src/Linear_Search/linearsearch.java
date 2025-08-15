
public class linearsearch {
    public static void main(String[] args) {
    int [] arr= new int[]{1, 2, 3, 4, 5, 6, 7, 9};
    int target=5;
    int result=searching(arr,target);
        System.out.println(result);
    }
    public static int searching(int [] arr,int target){
        if(arr.length==0){
            return -1;
        }
//        for(int i=0;i< arr.length;i++){
//            int element = arr[i];
//            if(element==target){
//                return i;
//            }
//        }
        for(int o: arr){
            if(o==target){
                return o;
            }
        }

        return -1;
    }
}
