package basic;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Alen");
        map.put(2,"Sonja");
        map.put(3,"Nina");
        for (Map.Entry student:map.entrySet()){
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }
}
