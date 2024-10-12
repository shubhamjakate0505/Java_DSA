import java.util.*;
public class Prob{
    
    private Node getMid(Node head){
            Node slow=head;
            Node fast=head.next;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
    }

    private Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next1;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head;
            head1=head1.next;
            temp=temp.next;
        }
          while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }



    public Node margeSort(Node head){
        if(head==null || head.next !=null){
            return head;
        }
        //find mid00
        Node mid=getMid();
        //left and right MS
        Node righthead=mid.next();
        mid.next=null;
        Node newLeft=margeSort(head);
        Node newright=margeSort(righthead);
        //merge
        return merge(newLeft,newright);
    }
    public static void main(String args[]){
     LinkeList ll=new LinkeList();
     ll.addFrist(1);
     ll.addFrist(2);
     ll.addFrist(3);
     ll.addFrist(4);
     ll.addFrist(5);
     ll.print();
     ll.head=ll.margeSort(ll.head);
     ll.print();

    }
}