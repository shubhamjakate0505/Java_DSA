import java.util.*;
public class slection{
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minspos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minspos]>arr[j]){
                   minspos=j;
                    }
            }
            int temp=arr[minspos];
            arr[minspos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        sort(arr);
        print(arr);
    }
}