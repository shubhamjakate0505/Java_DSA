import java.util.*;
public class Prob{
    
    public static void palidrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)==str.charAt(n-1-i)){
                System.out.println("String is palindrome");
                break;
            }
            else{
                System.out.println("String is  not palindrome");
            }
        }
    }
    
    public static void main(String args[]){
        String str="raccar";
        palidrome(str);
    }
}