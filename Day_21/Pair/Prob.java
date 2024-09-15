import java.util.*;
public class Prob{
    public static void Pair(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                 
                System.out.print("("+curr+","+arr[j]+")");
                count++;
               
            }
            System.out.println();
            
        }
        System.out.println("Total no.of pair : "+count);
    }

    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        Pair(arr);
    }
}