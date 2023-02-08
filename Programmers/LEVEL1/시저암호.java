class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]!=' '){
                c[i] += n;
                if((c[i]-n<'a' && c[i]>'Z')||c[i]>'z'){
                    c[i]-=26;
                }
            }
            answer += c[i];
        }
        return answer;
    }
}
