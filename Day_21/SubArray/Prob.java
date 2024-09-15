import java.util.*;
public class Prob{
    public static void Subarry(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                   
                    System.out.print(arr[k]+" ");
                }
                 count++;
                System.out.println();
            }
             System.out.println();
        } 
        System.out.println(count);  
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        Subarry(arr);
    }
}