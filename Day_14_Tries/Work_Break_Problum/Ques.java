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
        /* int level=0;
        int len=word.length();
        int idx=0; */
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
  /*   public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        
        for(int i=1;i<=key.length();i++){
            if(search(key.substring(0,i))&& wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    } */
    public static boolean StartWith(String prefix){
        Node curr=root;

        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.Childern[idx]==null){
                return false;
            }
            curr=curr.Childern[idx];
        }
        return true;
    }
    public static void main(String args[]){//O(L)
        String arr[]={"apple","app","mango","man","woman"};
        String prefix1="app";
        String prefix2="moon";
      for(int i=0;i<arr.length;i++){
        insert(arr[i]);
      }
      System.out.println(StartWith(prefix1));
      System.out.println(StartWith(prefix2));
      
}
}