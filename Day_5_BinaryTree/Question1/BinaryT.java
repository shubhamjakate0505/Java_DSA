import java.util.*;
public class BinaryT{
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

    static class BinaryTree{
        //
        static int idx=-1;
        public static Node buildTree(int nodes[]){//its return Node means Root Node
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newnode=new Node(nodes[idx]);
        newnode.left=buildTree(nodes);
        newnode.right=buildTree(nodes);
        
        return newnode;
      
      }


      //preoder

    public static void preoder(Node root){
        if(root==null){
            return;
        }
        
        //1)root
        //2)left
        //3)right
        System.out.print(root.data+" ");
        preoder(root.left);
        preoder(root.right);
        }
    //inorder

    public static void inoder(Node root){
        if(root==null){
            return;
        }
        
        inoder(root.left);
        System.out.print(root.data+" ");
        inoder(root.right);
    }

    public static void postoder(Node root){
        if(root==null){
            return;
        }
        postoder(root.left);
        postoder(root.right);
        System.out.print(root.data+" ");
    }

    //level order
    public static void leveup(Node root){
        if(root==null){
           return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }

                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }


    }
    




    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        // System.out.println(root.data);
        // tree.preoder(root);
        // tree.postoder(root);
        tree.leveup(root);
    }
}