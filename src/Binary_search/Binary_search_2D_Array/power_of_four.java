

public class power_of_four {
    public static void main(String[] args) {
        boolean bl = isPowerOfFour(16);
        System.out.println(bl);
    }
        public static boolean isPowerOfFour(int n) {
            if(n==0 || n==1){ return true;}
            if (((n & (n - 1)) == 0) && ((n - 1) % 3 == 0)) {
                    return true;
                }
            return false;
            }

        }

