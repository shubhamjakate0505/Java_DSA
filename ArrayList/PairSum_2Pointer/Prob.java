import java.util.*;
public class Prob{
    public static boolean Pairsum(ArrayList<Integer> list,int tar){
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==tar){
                return true;
            }
            if(list.get(lp)+list.get(rp)<tar){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    
    
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        int tar=5;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(Pairsum(list,tar));
    }
}