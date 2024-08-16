import java.util.*;
public class Approch2{
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
    public static int height(Node root){
        if(root==null){
            return 0;//height 0
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int diameter2(Node root){
        if(root==null){
            return 0;
        }
        int ldiameter=diameter2(root.left);
        int rdiameter=diameter2(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        int self=lh+rh+1;

        return Math.max(self,Math.max(rdiameter,ldiameter));
    } 
  //Returing diame,ht for each node
    static class Info{
        int diame;
        int ht;
        Info(int diame,int ht){
            this.diame=diame;
            this.ht=ht;
        }
    }  
    //returing Object of Info class
    public static Info diameter(Node root){
        //base 
        if(root==null){
            return new Info(0,0);//new object create and return ht,diam
        }

        Info leftinfo=diameter(root.left);
        Info rightinfo=diameter(root.right);

        int diamet=Math.max(Math.max(leftinfo.diame,rightinfo.diame),leftinfo.ht+rightinfo.ht+1);
        int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;

        return new Info(diamet,ht);
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
        System.out.println("Diameter Is : - "+diameter(root).diame);

    }
}