import java.util.LinkedHashMap;
import java.util.HashMap;
// import java.util.*;
public class HashMapDemo {  // Renamed class to avoid conflict
    public static void main(String args[]){
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 200);
        lhm.put("US", 300);
        lhm.put("America", 400);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 200);
        hm.put("US", 300);
        hm.put("America", 400);

        System.out.println(lhm);
        System.out.println(hm);
    }
}
