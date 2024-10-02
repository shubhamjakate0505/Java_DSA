import java.util.*;
public class prob{
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printarr(int n){
        if(n==0){
            return;
        }
        int lastnumber=n%10;
        printarr(n/10);
        System.out.print(digits[lastnumber]+" ");
    }

    public static void Strlen(String str,int idx){
        if()
    }

    public static void main(String args[]){

        String str="Shubham";
       /*  printarr(1234);
        System.out.println(); */
    }
}