package Practice;

import java.util.HashMap;

public class hashmap {
    public static void main(){
        HashMap<Integer,String> map = new HashMap<Integer, String>();

        map.put(1, "사과");
        map.put(2,"바나나");
        map.put(3,"포도");

        map.remove(1);
        System.out.println(map);
    }
}
