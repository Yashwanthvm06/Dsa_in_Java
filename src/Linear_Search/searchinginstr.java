package com;

public class searchinginstr {
    public static void main(String[] args) {
        String name = "Yash";
        char tar = 'a';
        System.out.println(linearsearch(name, tar));
    }
    public static boolean linearsearch(String naam,char tar)
    {
        if(naam.length()==0)
        {
            return false;
        }
//        for(int i=0;i<naam.length();i++){
//            if(naam.charAt(i)==tar){
//                return true;
//            }
//        }
        for(char c : naam.toCharArray() )
        {
           if(c==tar)
           {
               return true;
           }
        }
        return false;
    }
}
