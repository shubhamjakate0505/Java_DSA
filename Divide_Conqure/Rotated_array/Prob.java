import java.util.*;
public class Prob{
    public static void Search(int arr[],int tar,int si,int ei){
        int mid=si+(ei-si)/2;   

        // case
        if(arr[mid]==tar){
            return mid;
        }

        //line l1
        if(arr[si]<=arr[mid]){
            //case a :left
            if(arr[si]<=arr[mid]){
                if(arr[si]<=tar && tar<=arr[mid]){
                    // case a
                    return Search(arr,tar,si,mid-1);
                }else{
                    // case b
                    return Search(arr,tar,mid+1,ei);
                }
            }
        }else{
            // case c
            if(arr[mid]<=tar && tar<=arr[ei]){
                return Search(arr,tar,mid+1,ei);
            }else{
                return Search(arr,tar,si,mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int tar=0;
        int idx=Search(arr,tar,0,arr.length-1);
        System.out.println(idx);

    }
}