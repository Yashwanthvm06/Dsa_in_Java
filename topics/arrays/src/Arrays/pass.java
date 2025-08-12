package com.yash;
import java.util.Arrays;
import java.util.Scanner;
public class pass {
    public static void main(String[] args) {
        Scanner yaya = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=yaya.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] yash) {
        yash[3]=988;
    }
}
