import java.util.*;
public class Prob{
    public static float path(String str){
        int x=0;int y=0;
        for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='S'){
                y--;
            }else if(str.charAt(i)=='N'){
                y++;
            }else if(str.charAt(i)=='W'){
                x--;
            }else{
                 x++;
        }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String str="WNEENESENNN";
        System.out.println(path(str));
        
    }
}