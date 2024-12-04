import java.util.*;
public class Prob{
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};       
        int end[]={2,4,6,7,9,9};     

        //end time basic sorted
        int maxAct=0;
        ArrayList<Integer> Ans=new ArrayList<>();//for the Storing the output
        //1st Activity
        maxAct=1;//
        //add 
        Ans.add(0); 

        int lastEnd=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){
                maxAct++;
                Ans.add(i);
                lastEnd=end[i];
            }
        }
        System.out.println("Max  Activities = " +maxAct);
        for(int i=0;i<Ans.size();i++){
            System.out.print("A"+Ans.get(i)+" ");
        }
        System.out.println();


    }
}