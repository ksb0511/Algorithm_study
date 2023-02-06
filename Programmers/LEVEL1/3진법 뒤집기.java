import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        LinkedList ll = new LinkedList();
        while(n/3!=0){
            ll.add(n%3);
            n /=3;
        }
        ll.add(n%3);
        int x = 1;
        for(int i=ll.size()-1;i>=0;i--){
            answer += Integer.parseInt(ll.get(i).toString()) * x;
            x*=3;
        }
        return answer;
    }
}
