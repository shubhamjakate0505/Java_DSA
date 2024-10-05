import java.util.*;
public class LL{
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFrist(int data){

        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public void addLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }

    public void Printll(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public void Addmiddle(int idx,int data){
        if(idx==null){
            addFrist(data);
            return;
        }
        Node newnode=new Node(data);
        Node temp=head;
        int i=0;//track that my temp in which idx
        while(i<idx-1){//previous node
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }




    public static void main(String args[]){
        LL ll=new LL();
        
        ll.addFrist(10);
        
        ll.addFrist(20);
       
        ll.addLast(3);
        
        ll.addLast(4);
        ll.Addmiddle(2,7);
        ll.Printll();
    }

}