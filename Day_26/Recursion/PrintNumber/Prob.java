import java.util.*;
public class Prob{
    public static void Desr(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
         Desr(n-1);
        System.out.println(n+" ");
        
       
    }
    
    public static void main(String args[]){
        int n=5;
        
        Desr(n);
    }
}