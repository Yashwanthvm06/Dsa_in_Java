package List.ArrayList;

import java.util.*;

public class word_frequency {
    public static void main(String[] args) {
        String s1="hello world hello java hello world";
        String [] sa=s1.split(" ");
        List<String> s=new ArrayList<>(List.of(sa));
        List<String> uni=new ArrayList<>();
        for(String unique:s){
            if(!uni.contains(unique)){
                uni.add(unique);
            }
        }
        for(String word:uni){
            System.out.println(word+" ->"+Collections.frequency(s,word));
        }
    }
}
