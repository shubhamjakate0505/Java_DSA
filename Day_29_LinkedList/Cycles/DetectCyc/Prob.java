import java.util.*;
public class Prob{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int count=0; //for the counting Linked list size
    public void addFrist(int data){

        Node newnode=new Node(data);//create new node
        count++;
        if(head==null){//if the LL is null
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public void addLast(int data){
        Node newnode=new Node(data);
        count++;
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
        if(idx==0){
            addFrist(data);
            return;
        }
        Node newnode=new Node(data);
        count++;
        Node temp=head;
        int i=0;//track that my temp in which idx
        while(i<idx-1){//previous node
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public int removeFrist(){
        if(count==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(count==1){
            int val=head.data;//remove karna hai
            head=tail=null;
            count=0;
            return val;

        }

        
        
        int val=head.data;
        head=head.next;
        count--;
        return val;// remove kiya hua return kiya hai
    }
    public int removelast(){
        if(count==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(count==1){
            int val=head.data;
            head=tail=null;
            count=0;
            return val;
        }

        Node prev=head;
        for(int i=0;i<count-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;//remove karna hai isko
        prev.next=null;
        tail=prev;
        count--;
        return val;
    }
    public static int SearchItrative(int key){
        Node temp=head;
        int idx=0;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
    }

 /*    public Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
 */
  /*   public boolean checkpelidrom(){
        if(head==null ||head.next==null){//head ka next is null hai 
            return true;
        }
        //find min
        Node midNode=findmid(head);
        //reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    } */

   public static boolean detectcycle(){
    Node slow=head;
    Node fast=head;

    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true;
        }

    }
    return false;
   }





    public static void main(String args[]){
        // Problum ll=new Problum();
        
        // ll.addFrist(1);
        // ll.addFrist(2);
        // ll.addFrist(1);
        // ll.addFrist(4);
        // ll.addFrist(5);
        // ll.Printll();
        // System.out.println(ll.checkpelidrom());
        // System.out.println(SearchItrative(10));
       head=new Node(1);
       head.next= new Node(2);
       head.next.next= new Node(3);
    //    head.next.next.next=head;
       System.out.println(detectcycle());
        
     
        
    }

}