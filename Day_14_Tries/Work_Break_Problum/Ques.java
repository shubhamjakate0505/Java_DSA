import java.util.*;
public class Ques{
    static class Node{
        Node Childern[]=new Node[26];//childern data
        boolean eow=false;//end of word

         Node(){
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
        return curr.eow;
    }
    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        
        for(int i=1;i<=key.length();i++){
            if(search(key.substring(0,i))&& wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){//O(L)
        String arr[]={"i","like","sam","samsung","mobil","ice"};
      
       for(int i=0;i<arr.length;i++){
        insert(arr[i]);
       }
        String key="ilike";

        System.out.println(wordBreak(key));
    }
}