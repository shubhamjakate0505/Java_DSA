import java.util.*;
public class Prob{
    public static void Newarr(int arr[],int i,int val){
        //base 
        if(i==arr.length){
            printarr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        Newarr(arr,i+1,val+1);
        arr[i]=arr[i]-2;
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        Newarr(arr,0,1);
        printarr(arr);

    }
}