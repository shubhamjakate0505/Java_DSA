import java.util.*;
public class Imp{
    static class Queue{
        static int arr[];
        static int size;
        //here we are not taking fornt variable bcoz
        //we know always frist element is our front and it not gonna be change
        //but in case of rear we add element in Queue than its position always get changes
        static int rear;
    
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        //add
        public static void add(int data){
            //cheak weather our Queue is Full  not
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println(" Queue is Empty");
                return -1;

                 }
        int Front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];

        }
        rear=rear-1;
        return Front;


    }
    public static int peek(){
         if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;

            }
            return arr[0];
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