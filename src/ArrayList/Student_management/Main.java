package List.ArrayList.Student_management;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> s1=new ArrayList<>();
        s1.add(new Student(1,"yash",89));
        s1.add(new Student(2,"yashwa",85));
        s1.add(new Student(3,"yashwanth",90));
        System.out.println("Enter the id no to remove the student: ");
        Scanner sc=new Scanner(System.in);
        int id= sc.nextInt();
        s1.removeIf(s->s.getStu_id()==id);
        System.out.println("After removing the student: " + s1);
        System.out.println("Enter the Student name to search: ");
        String name= sc.next();
        boolean found=false;
        for(Student na:s1){
            if(na.getStu_name().equals(name)){
                System.out.println(na);
                found=true;
                break;
            }
        }
            if(!found){
                System.out.println("OOPS! no student found with that name.");
        }
        s1.sort((s1Obj, s2Obj) -> s2Obj.getstu_mark() - s1Obj.getstu_mark());
        int topMarks = s1.get(0).getstu_mark();
        for(Student s : s1){
            if(s.getstu_mark() == topMarks){
                System.out.println("Topper: " + s);
            } else {
                break; // list is sorted, so remaining marks are lower
            }
        }




    }
}
