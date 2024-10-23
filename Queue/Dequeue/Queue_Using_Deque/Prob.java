import java.util.*;
public class Prob{
    static class Queue{
        Deque<Integer> Dq=new LinkedList<>();

        public void add(int data){
            Dq.addLast(data);
        }
        public int remove(){
            return Dq.removeFirst();
        }
        public int peek(){
            return Dq.getFirst();
        }

    }
    
    
    public static void main(String args[]){
        Queue s=new Queue();
        s.add(1);
        s.add(2);
        s.add(3);
        // s.push(4);
        System.out.println(s.peek()+" Peek");
        System.out.println(s.remove()+" ");
        System.out.println(s.remove()+" ");
        System.out.println(s.remove()+" ");
   
    }
}