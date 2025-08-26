package List.LinkedList.Creation_Of_LL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList_Creation list1=new LinkedList_Creation();
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.print("Welcome to Linked List Manager\n" +
                    "1. Add at beginning\n" +
                    "2. Add at end\n" +
                    "3. Insert at position\n" +
                    "4. Delete by value\n" +
                    "5. Delete by position\n" +
                    "6. Reverse list\n" +
                    "7. Print list\n" +
                    "8. Exit\n" +
                    "Enter your choice: \n");
            choice = sc.nextInt();
            switch ( choice ) {
                case 1:
                    System.out.println("Enter a value to add at beginning: ");


            }


            list1.addlast(10);
            list1.addlast(20);
            list1.addlast(30);
            list1.addlast(40);
            list1.printlist();
            System.out.println("list after adding in beginning");
            list1.addfirst(1);
            list1.printlist();
            System.out.print("Insert at position ... Enter the position: ");
            int n = sc.nextInt();
            list1.insert_at_position(99, n);
            System.out.println("list after adding node in beginning or position");
            list1.printlist();
        }while(choice<=8);
    }
}
