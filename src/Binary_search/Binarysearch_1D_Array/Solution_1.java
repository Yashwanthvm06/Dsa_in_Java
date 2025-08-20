class Solution_1 {
// Define the MountainArray interface
interface MountainArray {
    public int get(int index);
    public int length();
}

// Implementing the MountainArray class
static class MountainArrayImpl implements MountainArray {
    private int[] arr;

    public MountainArrayImpl(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int length() {
        return arr.length;
    }
}

// Solution Class

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peak(mountainArr);

        // Search in the left side (ascending part)
        int first_half = binary_Agnostic(mountainArr, target, 0, peak);
        if (first_half != -1) {
            return first_half;
        }

        // Search in the right side (descending part)
        return binary_Agnostic(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    static int peak(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int binary_Agnostic(MountainArray mountainArr, int target, int start, int end) {
        boolean asc = mountainArr.get(start) < mountainArr.get(end);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);

            if (midValue == target) {
                return mid;
            }

            if (asc) {
                if (target < midValue) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > midValue) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public void main(String[] args) {
        // Example usage
        int[] mountainArrData = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;

        MountainArray mountainArr = new MountainArrayImpl(mountainArrData);
        Solution_1 solution = new Solution_1();

        int result = solution.findInMountainArray(target, mountainArr);
        System.out.println("Target found at index: " + result);
    }
}
