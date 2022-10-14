class Solution {
    boolean solution(String s) {
        char[] c = s.toCharArray();
        int p = 0;
        int y = 0;
        
        for(int i=0;i<c.length;i++){
            if(Character.toUpperCase(c[i])=='P')
                p++;
            else if(Character.toUpperCase(c[i])=='Y')
                y++;
        }
        
        if(p==y)
            return true;
        else
            return false;
        
    }
}
