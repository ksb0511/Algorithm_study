class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] x = phone_number.split("");
        
        int limit = 0;
        for(int i=x.length-1;i>=0;i--){
            if(limit<4){
                answer = x[i].toString() + answer;
                
            }else{
                answer = "*"+answer;
            }
            ++limit;
            
        }
        return answer;
    }
}
