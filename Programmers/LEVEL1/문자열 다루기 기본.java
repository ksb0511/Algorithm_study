class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        char[] arrayS = s.toCharArray();
        
        for(int i=0;i<arrayS.length;i++){
            if(Character.isDigit(arrayS[i])==false)
                return false;
        }
        
        if(arrayS.length==4 || arrayS.length==6)
            return true;
        return false;
    }
}
