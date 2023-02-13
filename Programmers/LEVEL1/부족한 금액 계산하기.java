class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;
        
        answer -= (long)count*(count+1)/2*price;

        return answer < 0 ? Math.abs(answer) : 0;
    }
}
