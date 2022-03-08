package Codility;

import java.util.Stack;

public class Q7_Nesting {
    public int solution(String S) {
        // write your code in Java SE 8

        char []c = S.toCharArray();

        Stack s = new Stack<>();

        for(int i=0;i<c.length;i++){
            if(c[i]==')'&&s.size()==0)
                return 0;
            else if(c[i]==')')
                s.pop();
            else
                s.push(c[i]);
        }
        if(s.size()==0)
            return 1;
        else return 0;
    }
}
