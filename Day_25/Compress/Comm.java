import java.util.*;
public class Comm{
    public static String compress(String str){
        String newstring="";
        // int cout=0;
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstring+=str.charAt(i);

            if(count>1){
                newstring+=count.toString();
            }
        }
        return newstring;
    }
    public static void main(String args[]){
        String str="aaabbccdd";
        System.out.println(compress(str));
    }
}