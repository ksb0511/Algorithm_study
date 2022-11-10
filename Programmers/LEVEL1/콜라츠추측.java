class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = (long)num;
        while(n!=1){
            if(answer>=500) break;
            if(n%2==0)
                n /= 2;
            else
                n = n*3 + 1;
            ++answer;
        }
        return (answer>=500)?(-1):answer;
    }
}
