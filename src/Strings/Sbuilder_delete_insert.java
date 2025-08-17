    package Strings;

    public class Sbuilder_delete_insert {
        public static void main(String[] args) {
          StringBuilder sb=new StringBuilder();
          String s1="JavaLab";
            System.out.print("Original : "+s1+"\n");
            sb.append(s1);
            int middle=sb.length()/2;
            System.out.print("After insert: ");
            String s2="123";
            System.out.println(sb.insert(middle+1,s2));
            System.out.print("After delete: ");
            System.out.println(sb.delete(middle+1,middle+1+s2.length()));
        }
    }
