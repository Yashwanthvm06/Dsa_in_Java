package bianry2d;

import java.util.Arrays;

public class Matrix2d {
    public static void main(String[] args) {
        int [][]arr={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        System.out.println(Arrays.toString(search(arr,9)));
    }
    public static int[] search2(int[][] mat, int row, int column_start, int column_end, int target){
        while(column_start<=column_end){
            int mid=column_start+(column_end-column_start)/2;
            if(target==mat[row][mid]){
                return new int[]{row,mid};
            }
            if(target<mat[row][mid]){
                column_end=mid-1;
            }
            else{
                column_start=mid+1;
            }
        }
        return new int []{-1,-1};
    }
    public static int [] search(int[][] mat, int target){
        int rows= mat.length;
        int cols=mat[0].length;
        if(rows==1)
        {
            return search2(mat,0,0,cols-1,target);
        }
        int row_start=0;
        int row_end=rows-1;
        int coloumn_mid=cols/2;
        while(row_start<(row_end-1)){
            int middle=row_start+(row_end-row_start)/2;
            if(target==mat[middle][coloumn_mid]){
                return new int[]{row_start,middle};
            }
            if(target<mat[middle][coloumn_mid]){
                row_end=middle;
            }
            else{
                row_start=middle;
            }
            //just unnecesary rows are removed
            //two rows are left

            if(target<=mat[row_start][coloumn_mid-1])
            {
                return search2(mat,row_start,0,coloumn_mid-1,target);
            }
            if(target>=mat[row_start][coloumn_mid+1] && target<=mat[row_start][cols-1]){
                return search2(mat,row_start,coloumn_mid+1,cols-1,target);
            }
            if(target<=mat[row_start+1][coloumn_mid-1]){
                return search2(mat,row_start+1,0,coloumn_mid-1,target);
            }
            else{
                return search2(mat,row_start+1,coloumn_mid+1,cols-1,target);
            }
        }

        return new int []{-1,-1};
    }
}
