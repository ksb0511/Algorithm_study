// STACK 사용하여 풀기
import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack stack = new Stack();
        char[] c = s.toCharArray();
        
        for(int i=0;i<c.length;i++){
            if(stack.size()==0)
                stack.push(c[i]);
            else if(!stack.peek().equals(c[i]))
                stack.push(c[i]);
            else
                stack.pop();
                
        }

        if(stack.size()==0)
            return 1;
        else return 0;
    }
}
