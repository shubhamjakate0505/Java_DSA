import java.util.*;
public class LinearSearch{
    public static int LinerSrch(int arr[],int key){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14,16};
        int key=10;
        int idx=LinerSrch(arr,key);
        if(idx==-1){
            System.out.println("Key is Not Found");
        }else{
            System.out.println("Key is Fount at Index  : "+idx);
        }
        
    }

}