// 1) Binary Search

import java.util.*;
public class BinarySearch{
    public static int BinaryS(int arr[],int key){
        int start=0;
        int last=arr.length-1;
        int mid;
        while(start<=last){
            mid=(start+last)/2;

            if(arr[mid]==key){
                return mid;
            }

            if(arr[mid]<key){//less than key than we find key in next half
                start=mid+1;
            }else{
                last=mid-1;
            }

        }
        return -1;
       
    }

    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14,16,20};
        int key=10;
        
        System.out.println("key is Found at index : "+ BinaryS(arr,key));

    }
}