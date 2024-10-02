import java.util.*;
public class Prob{
    public static int ways(int n){
        if(n==1||n==2){
            return n;
        }
        //single
        int fnm1=ways(n-1);
        //pairs
        int fnm2=ways(n-2);
        int pairway=(n-1)*(n-2);
        int total=fnm1+pairway;
        return total;
    }
    
    public static void main(String args[]){
        System.out.println(ways(4));
    }
}