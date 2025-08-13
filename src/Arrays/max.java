
public class max {
    public static void main(String[] args) {
      int [] arr={12,23,45,67,21};
        System.out.println(maxrange(arr,0,2));
    }
//    static int max(int [] arr){
//        int maxval=arr[0];
//        for(int i=0;i<4;i++){
//            if(arr[i]>maxval){
//                maxval=arr[i];
//            }
//        }
//        return maxval;
//    }
static int maxrange(int [] arr,int start,int end){
    int maxval=arr[start];
    for(int i=start;i<=end;i++){
        if(arr[i]>maxval){
            maxval=arr[i];
        }
    }
    return maxval;
}
}
