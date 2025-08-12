package com.yash;
import java.util.*;
public class Remove_duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        int [] arr=new int [n];
        int [] freq=new int[100];
        System.out.print("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            freq[arr[i]]++;
        }
        System.out.println("Unique elements are:");
        for(int i=0;i<100;i++) {
            if (freq[i] > 0) {
                System.out.println(i);
            }
        }
    }
}
