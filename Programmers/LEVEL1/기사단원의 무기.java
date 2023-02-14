class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1;i<=number;i++){
            int temp_num = 0;
            
            for(int j=1;j*j<=i;j++){
                if(j*j==i) temp_num++;
                else if(i%j==0) temp_num +=2;
            }
            answer +=temp_num>limit? power: temp_num;
        }
        return answer;
    }
}
