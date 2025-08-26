package List.LinkedList.Creation_Of_LL;

import java.util.Scanner;

public class LinkedList_Creation {
    class Node{
        int data;
        Node next;
        Node(int value){
            this.data=value;
            this.next=null;
        }
    }
    //insert at last
    Node head;
    void addlast(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    //insert at beginning
    void addfirst(int value){
        Node newNode_at_first=new Node(value);
        newNode_at_first.next=head;
        head=newNode_at_first;
    }
    //insert at position
    void insert_at_position(int value,int position){
        Node newNode=new Node(value);
        if(head==null || position==0){
            newNode.next=head;
            head=newNode;
            return ;
        }
        Node current=head;
        for(int i=1;i<position-1 && current.next!=null;i++){
            current=current.next;
        }

        newNode.next=current.next;//connect the currents nodes next node to the new node so it would join
        current.next=newNode;//connecting the new node front to the current node.....
    }
    //print the list
    void printlist(){
        Node current=head;
        if(head ==null){
            System.out.println("insert any variable");
            return ;
        }
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.print("null\n");
    }

}
