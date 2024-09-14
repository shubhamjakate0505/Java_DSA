import java.util.*;
public class Prob{
    public static int large(int arr[]){
        int lar=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=lar){
                lar=arr[i];
            }
        }
        return lar;
    }
    
    public static void main(String args[]){
        int arr[]={1,2,6,3,5};
        System.out.println(large(arr));

    }

}