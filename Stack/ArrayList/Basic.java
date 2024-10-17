import java.util.*;
public class Basic{
    static class Stack{
       static ArrayList<Integer> list=new ArrayList<>();

       public static boolean isEmpty(){
        return list.size()==0;
       }
       // push
       public static void Push(int data){
            list.add(data);
       }
    }
    public static void main(String args[]){

    }
}