

class Max_wealth {
    public static void main(String[] args) {
        int [][] accounts={{1,2,3},{3,2,3}};
        int res=maximumWealth(accounts);
        System.out.println(res);
    }
    public static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int [] i:accounts) {
            sum=0;
            for (int j : i) {
                sum+=j;
            }
        }
        if (max < sum) {
            max = sum;
        }
        return max;
    }
}