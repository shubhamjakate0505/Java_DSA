//TC=O(n^3)
import java.util.*;
public class MaxSum{
    public static void max(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){//2,4,5,-1,10
            currsum=0;
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    currsum+=arr[k];
               }
               System.out.print(currsum+" ");
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
            }
        System.out.println("Maxmum Sum "+maxsum);
    }
    public static void main(String args[]){
        int arr[]={2,4,5,-1,10};
        max(arr);
    }
}

