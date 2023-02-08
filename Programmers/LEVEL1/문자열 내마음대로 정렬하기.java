import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        for(int i=0;i<strings.length;i++){
            char c = strings[i].charAt(n);
            strings[i] = c + strings[i];
        }
        Arrays.sort(strings);
        for(int i=0;i<strings.length;i++){
            strings[i] = strings[i].substring(1);
        }
        return strings;
    }
}
