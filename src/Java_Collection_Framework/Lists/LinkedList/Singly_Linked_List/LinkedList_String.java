package List.LinkedList;
import java.util.*;
public class LinkedList_String {
    public static void main(String[] args) {
        List<String> names=new LinkedList<>();
        names.add("RAM");
        names.add("SAM");
        names.add("YAM");
        names.add("DAM");
        names.add("XAM");
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        names.set(0,"yashhh");
        System.out.println("After changing the name of 0 th index: "+names);
        names.removeFirst();
        names.removeLast();
        System.out.println("After removed the first and last: "+names );
    }
}
