import java.util.*;
public class Question3{
    public static void reverse(int arr[]){
        int frist=0;
        int last=arr.length-1;
        while(frist<last){
            //swap
            int temp=arr[last];
            arr[last]=arr[frist];
            arr[frist]=temp;

            frist++;
            last--;
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}