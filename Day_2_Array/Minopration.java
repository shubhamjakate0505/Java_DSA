/* You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.

Return the minimum number of operations to make all elements of nums divisible by 3. */


import java.util.*;
public class Minopration{
    public static int ops(int[] nums) {
        int count=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]%3 !=0){
                count++;
            }

        }
        
        return count;
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4};//3,6,9
        System.out.println(ops(nums));
    }
}