import java.util.*;
public class Prob{
    public static boolean iseorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        
        if(arr[i]>arr[i+1]){
            return false;
        }
        
        return iseorted(arr,i+1); 
    }
    
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        // int i=arr[0];
        System.out.println(iseorted(arr,0));
    }
}