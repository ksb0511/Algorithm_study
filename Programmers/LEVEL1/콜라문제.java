class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int whole = n;
        
        while(whole>a-1){
            int x = whole;
            while(x%a!=0){--x;}
            answer += x/a*b;
            whole = whole - x + x/a*b;
        }
        
        return answer;
    }
}
