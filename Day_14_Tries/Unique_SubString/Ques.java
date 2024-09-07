import java.util.*;
public class Ques{
    static class Node{
        Node Childern[]=new Node[26];//childern data
        boolean eow=false;//end of word

         public Node(){
        for(int i=0;i<26;i++){
            Childern[i]=null;
        }
    }
   
    }
    
    public static Node root=new Node();
    public static void insert(String word){//O(L)
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level) -'a';
            if(curr.Childern[idx]==null){
                curr.Childern[idx]=new Node();
            }
            curr=curr.Childern[idx];
        }
        curr.eow=true;
    }
    public static boolean search(String key){
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level) - 'a';
            if(curr.Childern[idx]==null){
                return false;
            }
            curr=curr.Childern[idx];
        }
        return curr.eow=true;
    }

    public static int Countnode(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.Childern[i] != null){
                count+=Countnode(root.Childern[i]);
            }
        }
        return count+1;
    }

    public static void main(String args[]){//O(L)
     String str="ababa";

     //suffix
     for(int i=0;i<str.length();i++){
        String suffix=str.substring(i);
        insert(suffix);
     }
     System.out.println(Countnode(root));
}
}