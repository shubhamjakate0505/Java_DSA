import java.util.*;
public class Twosum{
    public static int[] two(int arr[],int target){
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }    

    public static void main(String args[]){
        int arr[]={2,7,11,15};
        int target=9;
        int result[]=two(arr,target);
        System.out.println(Arrays.toString(result));
    }
}