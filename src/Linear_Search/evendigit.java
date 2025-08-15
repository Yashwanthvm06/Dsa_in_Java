package com;

public class evendigit {
    public static void main(String[] args) {
        int [] arr ={12,345,234,56};
        System.out.println(findnum(arr));
    }

    static int findnum(int[] arr) {
        int count =0;
        for(int i : arr){
            if(even(i)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int nume=dig(num);
        if(nume%2==0){
            return true;
        }
        return false;
    }
    static int dig(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }


}
