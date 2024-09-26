import java.util.*;
public class Prob{
    public static int Sumof(int n){
        if(n==0){
            return 0;
        }
        int sum=n + Sumof(n-1);
        return sum;
        // System.out.println("Sum is :"+sum);
    }
    public static void main(String args[]){
        int n=10;
        System.out.println(Sumof(n));


    }
}