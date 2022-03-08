package Codility;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Q8_Dominator {
    public int solution(int[] A) {
        // write your code in Java SE 8

        int result = -1;

        HashMap<Integer, Vector<Integer>> hm = new HashMap<Integer, Vector<Integer>>();

        for(int i=0;i<A.length;++i){
            if(hm.containsKey(A[i])){
                Vector<Integer> v = hm.get(A[i]);
                v.add(i);
                hm.replace(A[i],v);
            } else {
                Vector<Integer> v =new Vector<Integer>();
                v.add(i);
                hm.put(A[i], v);
            }
        }

        for(Map.Entry<Integer, Vector<Integer>> elem : hm.entrySet()){
            if(elem.getValue().size()>=(A.length/2)+1){
                result = elem.getValue().get(0);
            }
        }
        return result;
    }

    public int solution2(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<A.length;i++){
            map.put(A[i], map.getOrDefault(A[i],0)+1);
        }

        int max = 0;
        int maxKey = 0;
        for(Integer key : map.keySet()){
            int count = map.get(key);
            if(count>max){
                max=count;
                maxKey = key;
            }
        }

        if(max<=A.length/2)
            return -1;
        
        for(int i=0;i<A.length;i++){
            if(A[i]==maxKey)
                return i;
        }

        return -1;
    }
}
