import java.util.*;
public class Prob{
    public static void Search(int arr[],int key,int si){
        if(si==arr.length){
            return;
        }
    
        if(arr[si]==key){
            System.out.print(si+" ");
        }
        Search(arr,key,si+1);
    }

    public static void main(String args[]){
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        Search(arr,key,0);
    }
}