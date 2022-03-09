package Private.skill.LEVEL2;

import java.util.Stack;

//성공
public class Problem_1 {

    public int solution(String s)
    {
        
        char [] c = s.toCharArray();
        
        Stack<Character> stack = new Stack<>();
        
        stack.push(c[0]);
            
        for(int i=1;i<c.length;i++){
            if(stack.size()>0&&stack.peek()==(c[i]))
                stack.pop();
            else
                stack.push(c[i]);
        }
        
        return stack.size()==0?1:0;
    }

}
