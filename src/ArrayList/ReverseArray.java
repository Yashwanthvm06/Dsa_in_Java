package List.ArrayList;

import java.util.Scanner;

//4. Array – Reverse Elements
//Question:
//Write a program to reverse the elements of an array.
//Expected Output:
//Input: 11 22 33 44
//Reverse: 44 33 22 11
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        System.out.print("Enter the size of array ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
