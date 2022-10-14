class Solution {
    public boolean solution(int x) {
        int result = x;
        int a = 0;
        
        while(result>0){
            a += result%10;
            result = result/10;
            
        }
        
        return (x%a==0)?true:false;
    }
}
