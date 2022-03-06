package Codility;

import java.util.Stack;

public class Q7_Brackets {
    public int solution(String S) {
        // write your code in Java SE 8

        Stack s = new Stack();

        char s_char[] = S.toCharArray();

        int x;

        for(int i=0;i<s_char.length;i++){

            if(s_char[i]=='('||s_char[i]==')')
                x=1;
            else if(s_char[i]=='{'||s_char[i]=='}')
                x=2;
            else
                x=3;

            if(s_char[i]=='('||s_char[i]=='{'||s_char[i]=='[')
                s.push(x);

            else if(s.size()==0)
                return 0;
            else{
                if(s.peek().equals(x))
                    s.pop();
            }
                
                
        }

        if(s.size()!=0)
            return 0;
        // s.push()
        // System.out.println(S);

        

        return 1;
    }
}
