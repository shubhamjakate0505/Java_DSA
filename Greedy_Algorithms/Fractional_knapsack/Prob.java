import java.util.*;

public class Prob{
    public static void main(String args[]){
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30}; // corrected variable name
        int W = 50;

        // Sort by value/weight ratio
        double ratio[][] = new double[val.length][2];
        // 0th col => idx; 1st col => ratio

        for(int i = 0; i < val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i]; // missing semicolon corrected
        }

        // Sort based on ratio (descending order)
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); // corrected lambda syntax

        int capacity = W;
        int finalVal = 0;

        for(int i = ratio.length - 1; i >= 0; i--){
            int idx = (int) ratio[i][0]; // casting double to int
            if(capacity >= weight[idx]){
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                finalVal += (ratio[i][1] * capacity); // fractional part of the item
                capacity = 0;
                break;
            }
        }

        System.out.println(finalVal);
    }
}
