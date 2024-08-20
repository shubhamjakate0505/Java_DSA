//O(n)
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
   
    public static boolean getpath(Node root,int n, ArrayList<Node> path){
        //base case
        if(root==null){
            return false;
        }

        path.add(root);
        if(root.data==n){
            return true;

        }
        boolean foundLeft=getpath(root.left,n,path);
        boolean foundRight=getpath(root.right,n,path);

        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }

   public static Node CommanParant(Node root,int n1,int n2){
    ArrayList<Node> path1=new ArrayList<>();
    ArrayList<Node> path2=new ArrayList<>();

    getpath(root,n1,path1);
    getpath(root,n2,path2);

    //last comman Ancentors
    int i=0;
    for(i=0; i<path1.size() && i<path2.size(); i++){
        if(path1.get(i)!=path2.get(i)){//agar path same hai to chalna chaiye loop otherwise it should break
            break;
        }
    }

    //last equal value
    Node CommanParant=path1.get(i-1);
    return CommanParant;
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
       System.out.println(CommanParant(root,n1,n2).data);

    }
}