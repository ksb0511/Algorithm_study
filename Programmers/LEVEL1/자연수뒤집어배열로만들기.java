class Solution {
    public int[] solution(long n) {
        String s =""+n;
		int[] answer = new int[s.length()];
		int cnt=0;
        
        while(cnt<answer.length){
            answer[cnt]=(int)n%10;
            n = n/10;
            cnt++;
        }
        
        return answer;
    }
}

class Solution2 {
    public int[] solution(long n) {
        String str = String.valueOf(n);
	    char[] s = str.toCharArray();
	    int[] answer = new int[str.length()];
	    for(int i=str.length()-1;i>=0;i--) {
	        answer[str.length()-1-i] = str.charAt(i)-'0';
	    }
	    return answer;
    }
}
