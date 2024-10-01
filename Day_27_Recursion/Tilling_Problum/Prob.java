import java.util.*;
public class Prob{
    public static int taillingPro(int n){
        if(n==0 || n==1){
            return 1;
        }
        // horizantal
        int fnm1=taillingPro(n-1);
        //vertical
        int fnm2=taillingPro(n-2);
        int total=fnm1+fnm2;
        return total;

    }
    public static void main(String args[]){
        System.out.println(taillingPro(4));
    }
}