public class maxof2d{
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},
                {56,6},
                {7,8,9,10}
        };
        int target=7;
        int res=search(arr);
        System.out.println(res);
    }

    private static int search(int[][] arr) {
        int max=Integer.MIN_VALUE;
        for(int [] i:arr){
            for(int j : i){
                if(j>max){
                    max=j;
                }
            }
        }
        return max;
    }

}

