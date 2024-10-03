import java.util.*;
public class Prob{
    public static void subset(String str,int i,String ans){
       //base
       if(i==str.length()){
        if(ans.length()==0){
        System.out.print("Null");
        }else{
            System.out.println(ans);
        }
        return;
       } 
        // recursion
        subset(str,i+1,ans+str.charAt(i));
        subset(str,i+1,ans);

    }
    
    
    public static void main(String arr[]){
        String str="abc";
        subset(str,0,"");
    }
}