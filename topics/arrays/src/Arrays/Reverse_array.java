    package com.yash;
    import  java.util.*;
    public class Reverse_array {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the size: ");
            int n=sc.nextInt();
            int [] arr=new int [n];
            System.out.print("Enter the array: ");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int [] temp=new int[n];
            System.out.println("reversed array is: ");
            int j=0;
            for(int i=n-1;i>=0;i--) {
                temp[j] = arr[i];
                j++;
            }
            for(int reversed:temp)
            {
                System.out.print(reversed+ " ");
            }
        }
    }
