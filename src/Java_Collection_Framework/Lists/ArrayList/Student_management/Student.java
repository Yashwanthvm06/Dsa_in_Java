package List.ArrayList.Student_management;
import java.util.*;
public class Student {
    private final int stu_id;
    private final String stu_name;
    int stu_mark;

    Student(int id,String name,int marks){
        this.stu_id=id;
        this.stu_name=name;
        this.stu_mark=marks;
    }
    public int getStu_id(){
        return stu_id;
    }
    public String getStu_name(){
        return stu_name;
    }
    @Override
    public String toString(){
        return "ID: " + stu_id + ", Name: " + stu_name + ", Marks: "  + stu_mark;
    }

    public int getstu_mark() {
    return stu_mark;
    }
}
