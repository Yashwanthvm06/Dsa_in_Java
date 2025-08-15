
public class Rotatedwithduplicate {
    public static void main(String[] args) {
        int [] arr={5, 1, 2, 3, 4};
        int res=findKRotation(arr);
        System.out.println(res);
    }
       static int findKRotation(int[] arr) {
            int res=findpivot(arr);
            return res+1;
        }
         static int findpivot(int [] arr)
        {
            int start=0;
            int end=arr.length-1;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(mid < end && arr[mid]>arr[mid+1])
                {
                    return mid;
                }
                else if(start < mid && arr[mid-1]>arr[mid])
                {
                    return mid-1;
                }
                else if(arr[start]>=arr[mid])
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }

            }
            return -1;
        }
    }
