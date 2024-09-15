import java.util.*;
public class Prob{
    public static void maxxsum(int arr[]){
       
        int currSum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                   currSum+=arr[k];
                    // System.out.print(arr[k]+" ");
                }
                System.out.print(currSum +" ");
                if(maxsum<currSum){
                    maxsum=currSum;
                }
               
            }
           
        } 
        System.out.println("max sum"+maxsum);
        
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        maxxsum(arr);
    }
}