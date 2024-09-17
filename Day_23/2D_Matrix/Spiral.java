import java.util.*;
public class Spiral{
    
    public static void Spiral(int arr[][]){
        int startRow=0;
        int EndRow=arr.length-1;
        int startcol=0;
        int Endcol=arr[0].length-1;

        while(startRow<=EndRow && startcol<=Endcol){
            //top
            
            for(int j=startcol;j<=Endcol;j++){
                System.out.print(arr[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1;i<=EndRow;i++){
                System.out.print(arr[i][Endcol]+" ");
            }
            //bottom
            for(int j=Endcol-1;j>=startcol;j--){
                if(startRow==EndRow){
                    break;
                }
                System.out.print(arr[EndRow][j]+" ");
            }
            //lefti
             for(int i=EndRow-1;i>=startRow+1;i--){
                  if(startcol==Endcol){
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            }
            startcol++;
            startRow++;
            Endcol--;
            EndRow--;
        }
        System.out.println();
    }
    
 public static void main(String args[]){
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        Spiral(arr);
    }
}