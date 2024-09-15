import java.util.*;
public class Problum{
    public static void maxsum(int arr[]){
        int currSum=0;
        int max=Integer.MIN_VALUE;

        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];//Privious+curr sum
        }

        for(int i=0;i<arr.length;i++){//start
            for(int j=i;j<arr.length;j++){//end
                currSum=i==0 ? prefix[j]:prefix[j]-prefix[i-1];
               
                System.out.println(currSum+" ");
                if(max<currSum){
                    max=currSum;
                }
           }
        }
        System.out.println("Maxmum Sum : " + max);
    }
    
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        maxsum(arr);
    }
}