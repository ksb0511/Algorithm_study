import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0;
        for(int i=0;i<d.length;i++){
            sum += d[i];
        }
        if(sum==budget) return d.length;
        
        Arrays.sort(d);
        
        int i=d.length-1;
        while(sum>budget){
            sum -=d[i];
            i--;
        }
        return i+1;
    }
}
