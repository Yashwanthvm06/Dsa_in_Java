package Strings;

public class Is_anagram {
    public static void main(String[] args) {
        String s1 = "listen,silent";
        String[] st2 = s1.split(",");
        int[] arr1 = new int[2];
        for (int i = 0; i < st2.length; i++) {
            for (int j = 0; j < st2[i].length(); j++){
                arr1[i] += st2[i].charAt(j);
        }
    }
        System.out.println(arr1[0]==arr1[1]);
    }
}
