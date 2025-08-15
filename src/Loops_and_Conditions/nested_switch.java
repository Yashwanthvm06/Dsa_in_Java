import java.util.Scanner;
public class nested_switch {
    public static void main(String[] args) {
        Scanner yaya = new Scanner(System.in);
        int stu_id = yaya.nextInt();
        String department = yaya.next();
        switch ( stu_id ) {
            case 1:
                System.out.println("Yashwanth");
                break;
            case 2:
                System.out.println("nikhil");
                break;
            case 3:
                System.out.println("Yogesh");
                break;
            case 4:
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "CSD":
                        System.out.println("csd Department");
                        break;
                }
                break;
            default:
                System.out.println("Enter stu_id or department");

        }

    }
}
