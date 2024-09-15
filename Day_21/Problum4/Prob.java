import java.util.*;
public class Prob{
    public static void revers(int arr[]){
        int start=0;
        int last=arr.length-1;
        while(start<last){
            int temp=arr[last];
            arr[last]=arr[start];
            arr[start]=temp;

            start++;
            last--;
        }
    }
    
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        //System.out.println(revers(arr));
        revers(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}