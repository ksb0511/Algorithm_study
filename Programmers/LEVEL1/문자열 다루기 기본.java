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

// 2023.02.14에 다시 푼 문제
class Solution {
    public boolean solution(String s) {
        if(s.length()!=4&&s.length()!=6) return false;
        
        try{
            Long.parseLong(s);
            return true;
        } catch(Exception e){
            return false;
        }
    }
}
