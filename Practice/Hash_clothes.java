package Practice;

import java.util.stream.Collectors;

import java.util.*;
import static java.util.stream.Collectors.*;

public class Hash_clothes {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        List<String> list = new ArrayList<>();
        for(int i=0;i<clothes.length;i++){
            list.add(clothes[i][1]);
        }
        
        List<String> list2 = list.stream().distinct().collect(Collectors.toList());
        
        
        for(int i=0;i<list2.size();i++)
            answer *= (Collections.frequency(list, list2.get(i))+1);
        
        
        
        return answer-1;
    }

    public int solution2(String[][] clothes) {
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
    }
}
