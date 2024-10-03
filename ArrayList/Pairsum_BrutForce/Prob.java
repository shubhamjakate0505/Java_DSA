import java.util.*;
public class Prob{
    public static boolean Pairsum(ArrayList<Integer> list,int tar){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==tar){
                    return true;
                }
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