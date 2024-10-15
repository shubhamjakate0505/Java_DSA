import java.util.*;
public class Prob{
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
    public void zigzag(){
            Node slow=head;
            Node fast=head.next;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            Node mid=slow; 

            //reverse 2nd half
            Node curr=mid.next;
            mid.next=null;
            Node prev=null;
            Node next;

            while(curr !=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }

            Node left=head;
            Node right=prev;
            Node nextL,nextR;

            //alt merge -zig-zag merge

            while(left!=null && right !=null){
                nextL=left.next;
                left.next=right;
                nextR=right.next;
                right.next=nextL;
                
                left=nextL;
                right=nextR;
            }

    }    
        public void Print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("Null");
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
    public static void main(String args[]){
        Prob ll=new Prob();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.Print();
        ll.zigzag();
        ll.Print();
    }
}