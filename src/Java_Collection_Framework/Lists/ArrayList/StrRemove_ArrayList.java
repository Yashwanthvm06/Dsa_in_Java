package List.ArrayList;

import java.util.*;

//6. ArrayList – Remove Element
//Question:
//Write a program to remove an element from an ArrayList.
//Expected Output:
//List: [Red, Green, Blue, Yellow]
//Remove: Blue
//Result: [Red, Green, Yellow]
public class StrRemove_ArrayList {
    public static void main(String[] args) {
    List<String> str=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of list: ");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        str.add(sc.next());
    }
        System.out.print("Enter the String to remove: ");
    String s= sc.next();
        str.remove(s);
        System.out.println(str);
    }
}
