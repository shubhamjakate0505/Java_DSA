import java.util.*;
public class Prob{
    static class stack{
        Deque<Integer> Dq=new LinkedList<>();

        public void push(int data){
            Dq.addLast(data);
        }
         public int pop(){
            return Dq.removeLast();
        }
         public int peek(){
            return Dq.getLast();
        }

    }
    
    
    public static void main(String args[]){
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        // s.push(4);
        System.out.println(s.peek()+" Peek");
        System.out.println(s.pop()+" ");
        System.out.println(s.pop()+" ");
        System.out.println(s.pop()+" ");
   
    }
}