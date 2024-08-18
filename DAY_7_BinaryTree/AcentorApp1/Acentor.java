//o(n)
import java.util.*;
public class Acentor{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    public static void level(Node root,int lval,int k){
        
        //base case
        if(root==null){
            return;
        }
        if(lval==k){
            System.out.print(root.data+" ");
            return;
        }
        level(root.left,lval+1,k);
        level(root.right,lval+1,k);


    }
    public static boolean getpath()

   public static Node CommanParant(Node root,int n1,int n3){
    ArrayList<Integer> path1=new ArrayList<>();
    ArrayList<Integer> path2=new ArrayList<>();

    getpath(root,n1,path1);
    getpath(root,n2,path2);

    //last comman Ancentors
    int i=0;
    for(i=0; i<path1.size() && path2.size();i++){
        if(path1.get(i)!=path2.get(i)){//agar path same hai to chalna chaiye loop otherwise it should break
            break;
        }
    }

    //last equal value
    Node CommanParant=path1.get(i-1);
   }
    
    public static void main(String args[]){

      /*    1
          /   \
         2     3
        / \   / \
       4  5  6   7   */


        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.right.left=new Node(7);
       int n1=4, n2=5;

    }
}