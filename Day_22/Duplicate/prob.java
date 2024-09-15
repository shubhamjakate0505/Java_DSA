import java.util.*;
public class prob{
    public static int dublicate(int arr[]){
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                       for(int k=j;k<arr.length-1;k++){
                        arr[k]=arr[k+1];
                       }
                       arr--;
                       j--;
                    }
                }
            }
           
    }
    
    public static void main(String args[]){
        int arr[]={1,2,1,3};
        System.out.println(dublicate(arr));
    }
}