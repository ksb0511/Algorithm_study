import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String[] s = String.valueOf(n).split("");
        
        for(int i=0;i<s.length;i++){
            answer += Integer.valueOf(s[i]);
        }
        return answer;
    }
}
