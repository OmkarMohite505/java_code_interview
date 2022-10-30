import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Omkar");
        map.put(2, "Mohite");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(5));
        // for(Map.Entry<Integer, String> m:map.entrySet()){
        //     System.out.println(m.getKey());
        //     System.out.println(m.getValue());
        // }
        map.entrySet().stream().forEach(e -> System.out.println(e));
    }

}
