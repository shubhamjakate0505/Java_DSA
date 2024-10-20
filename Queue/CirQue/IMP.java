import java.util.*;
public class IMP{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
    
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isfull(){
            return (rear+1)%size==front;
        }
        //add
        public static void add(int data){
            //cheak weather our Queue is Full  not
            if(isfull()){
                System.out.println("Queue is full");
                return;
            }
            //add Frist Element 
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println(" Queue is Empty");
                return -1;

                 }
        int result=arr[front];
        front=(front+1)%size;
        //last el delete
        if(rear==front){
            rear=front=-1;

        }
        else{
            front=(front+1)%size;
        }
        return result;


    }
    //peek(0)
    public static int peek(){
         if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;

            }
            return arr[front];
    }
    }


    
    public static void main(String args[]){
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
          System.out.println(q.peek());
          q.remove();
        }

    }   
}