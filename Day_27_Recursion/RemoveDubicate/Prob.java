import java.util.*;
public class Prob{
   
   
    public static void removeDup(String str,int idx,StringBuilder newstr,boolean map[]){
        
        //
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){//matlab dublicate exit karta hai to next char ke liye call karo
                removeDup(str,idx+1,newstr,map);
        }else{
            map[currchar-'a']=true;
            removeDup(str,idx+1,newstr.append(currchar),map);
        }

    }
   
    public static void main(String[] args){
        String str="college";
        removeDup(str,0,new StringBuilder(""),new boolean[26]);
    }
}