import java.util.*;
public class Ops{
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();
        //insert
        hm.put("India",12000);
        hm.put("Chine",50);
        hm.put("US",100);
        hm.put("Indonisiya",200);
        hm.put("America",300);
       /*  System.out.println(hm);

        //get
        int population=hm.get("US");
        System.out.println(population);

        //contains
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Bihar"));

        //remove
        int del=hm.remove("US");
        System.out.println("Deleted hashmap"+hm);
 */
    Set<String> keys=hm.keySet();
    System.out.println(keys);

    for(String k:keys){
        System.out.println("Key="+k+",values"+hm.get(k));
    }

    }
}