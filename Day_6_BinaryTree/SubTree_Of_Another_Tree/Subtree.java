import java.util.*;
public class Subtree{
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
    
    public static boolean isIdentical(Node node,Node SubRoot){
        if(node ==null && SubRoot==null){
            return true;
        }else if(node==null || SubRoot==null || node.data !=SubRoot.data){
            return false;
        }
        if(!isIdentical(node.left,SubRoot.left)){
            return false;
        }
         if(!isIdentical(node.right,SubRoot.right)){
            return false;
        }
        return true;
    }


    public static boolean isSubroot(Node root,Node Subroot){
            if(root==null){
                return false;
            }

        if(root.data==Subroot.data){
            if(isIdentical(root,Subroot)){
                return true;
            }
        }
        
        boolean leftAns=isSubroot(root.left,Subroot);//return true
        boolean rightAns=isSubroot(root.right,Subroot);//return true

        return leftAns || rightAns;
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

        //SubRoot

          /*    2
               / \
              4   5
           */
        Node Subroot=new Node(2);
        Subroot.left=new Node(4);
        Subroot.right=new Node(5);
          System.out.println(isSubroot(root,Subroot));

    }
}