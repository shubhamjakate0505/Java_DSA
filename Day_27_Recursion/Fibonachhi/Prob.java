import java.util.*;
public class Prob{
    public static int Fib(int n){
        
        if(n==0 || n==1){
            return n;
        }
        
        
        int fibnm1=Fib(n-1);
        int fibnm2=Fib(n-2);
        int fn=fibnm1+fibnm2;
        return fn;

    }
    
    public static void main(String args[]){
        int n=25;
        System.out.println(Fib(n));
    }
}