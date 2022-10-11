import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        String[] set = new String[words.length];
        int stop = 0;
        
        
        for(int i=0;i<words.length;i++){
            if(Arrays.asList(set).contains(words[i])){
                stop = i;
                break;
            }
            set[i] = words[i];
                
            if(i==words.length-1)
                break;
            
            if(words[i+1].charAt(0)!=words[i].charAt(words[i].length()-1)){
                stop = i+1;
                break;
            }
                
            
        }
        if(stop==0){
            answer[0] = 0;
            answer[1] = 0;
        }else {
            int x = stop+1;
            
            answer[0] = x%n==0?n:x%n;
            answer[1] = x%n==0?x/n:x/n+1;
        }
        
        return answer;
    }
}
