package J_Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class J_Map {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"a");
        map.put(2,"w");
        System.out.println(map.keySet());
        System.out.println(map.get(0));
//        0 is null because there is no key's value of zero
        for (Integer key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }



    }
}
