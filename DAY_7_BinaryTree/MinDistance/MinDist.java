//o(n)
import java.util.*;
public class App2{
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
public static Node lca2(Node root,int n1,int n2){
       
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node left=lca2(root.left,n1,n2);
        Node right=lca2(root.right,n1,n2);

        //Suppose left is valide and right is invalide or we cay say it wil nul than
        if(right==null){
            return left;
        }
        if(left==null){
            return right;
        }

        return root;

    }

    public static int minDist(Node root,int n1,int n2){
        Node lca=lca2(root,n1,n2);
        int Dist1=lcaDist(root,n1);

        int Dist2=lcaDist(root,n2);

        return Dist1+Dist2;
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
       int n1=4, n2=7;
       System.out.println(lca2(root,n1,n2).data);

    }
}