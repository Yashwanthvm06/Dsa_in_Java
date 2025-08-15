package com;

class No_with_2digits {
    public static void main(String[] args) {
        int [] arr={12,3,43,5};
        int n = findNumbers(arr);
        System.out.println(n);
    }
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) { // Iterate through each number in the array
            int no_dig = dig(num); // Get the number of digits
            if (no_dig % 2 == 0) { // Check if it's even
                count++;
            }
        }
        return count; // Return total count
    }

    static int dig(int num) {
        if (num == 0) return 1; // Special case for zero
        return (int)(Math.log10(num)) + 1; // Correct way to count digits
    }
}


