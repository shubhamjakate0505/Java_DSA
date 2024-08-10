import java.util.*;
public class Question5{
    public static void subarry(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i+1;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
             System.out.println();
        }
        System.out.println("Taotal : " + ts);
    }
    public static void main(String args[]){
    int arr[]={2,4,6,8,10};
    subarry(arr);
}

}
