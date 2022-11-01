import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int x = (100-progresses[0])/speeds[0]+(((100-progresses[0])%speeds[0]==0)?0:1);
        int days = 1;
        ArrayList<Integer> al = new ArrayList();
        for(int i=1;i<progresses.length;i++){
            int y = (100-progresses[i])/speeds[i]+(((100-progresses[i])%speeds[i]==0)?0:1);
            if(x>=y){
                days++;
            }else {
                x = y;
                al.add(days);
                days = 1;
            }
        }
        if(days!=0)
            al.add(days);
        return al.stream().mapToInt(i->i).toArray();
    }
}
