import java.util.*;
public class Question2{
    public static int LargerNum(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(largest<arr[i]){
                largest=arr[i];
                
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int arr[]={1,2,6,3,5};
        System.out.println("Largest value of the arr is : "+LargerNum(arr));
    }
}