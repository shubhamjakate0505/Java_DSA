import java.util.*;
public class Prob{
    
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
                curr=next;
            }
    }    
    public static void main(String args[]){

    }
}