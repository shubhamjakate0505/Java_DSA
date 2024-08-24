import java.util.*;
public class DeleteBST{

// -------------------------------Node---------------------------------
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
// -----------------------Insert--------------------------------------------
    public static Node insert(Node root,int val){//root And New Value
        if(root==null){
            root=new Node(val);//create new Node 
            return root;
        }
        if(root.data>val){
            //left.data
           root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
          return root;
    }

// -----------------------------inorder-------------------------------------
    public static void inOrder(Node root){
       
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
       
        inOrder(root.right);
        
    }
// ----------------------Search Key--------------------------------------

public static boolean Search(Node root,int key){

    if(root==null){
        return false;
    }
    if(root.data==key){
        return true;
    }
    if(root.data>key){
        return Search(root.left,key);
    }else{
        return Search(root.right,key);
    }
       
}

public static Node delete(Node root, int val) {
    if (root == null) {
        return null;
    }

    if (root.data < val) {
        root.right = delete(root.right, val);
    } else if (root.data > val) {
        root.left = delete(root.left, val);  // Corrected this line
    } else {
        // Case 1: Leaf node
        if (root.left == null && root.right == null) {
            return null;
        }

        // Case 2: Single child
        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        }

        // Case 3: Two children
        Node inorderSuccessor = findInoderSuccessor(root.right);
        root.data = inorderSuccessor.data;
        root.right = delete(root.right, inorderSuccessor.data);
    }

    return root;
}

public static Node findInoderSuccessor(Node root){
    while(root.left !=null){
        root=root.left;
    }
    return root;
}

// ---------------------------------main------------------------------------

       public static void main(String args[]){
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

    inOrder(root);
    System.out.println();

    root=delete(root,1);
    System.out.println();
    inOrder(root)
       }
}