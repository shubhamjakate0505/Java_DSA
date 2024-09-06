import java.util.*;
public class CountN{
    public static void main(String args[]){
        int nums[]={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> Set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            Set.add(nums[i]);
        }      
        System.out.println(Set.size());

    }
}