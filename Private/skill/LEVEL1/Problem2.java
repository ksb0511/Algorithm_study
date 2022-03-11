package Private.skill.LEVEL1;

import java.util.Arrays;

public class Problem2 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int win=0, zero=0;
        
        String[] lottos_s = Arrays.stream(lottos)
                                .mapToObj(String::valueOf)
                                .toArray(String[]::new);
        
        String[] win_nums_s = Arrays.stream(win_nums)
                                .mapToObj(String::valueOf)
                                .toArray(String[]::new);
 
        for(int i=0;i<lottos_s.length;i++){
            if(lottos[i]==0)
                zero++;
            
            if(Arrays.asList(lottos_s).contains(win_nums_s[i]))
                win++;
            
        }
        
        answer[0] = (win+zero)<2?6:7-(win+zero);
        answer[1] = win<2?6:7-win;
        return answer;
    }
}


