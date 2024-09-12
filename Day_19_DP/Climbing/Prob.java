import java.util.*;
public class Prob{
    public static int countways(int n){
        if(n==0){
            return 1;

        }
        if(n<0){
            return 0;
        }
        return countways(n-1)+countways(n-2);
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(countways(n));
    }
}