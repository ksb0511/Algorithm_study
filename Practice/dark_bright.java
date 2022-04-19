package Practice;

public class dark_bright {
    public int solution(int[] absolutes, boolean[] signs) {
        int result=0;
        
        for(int i=0;i<absolutes.length;i++){
            if(!signs[i]){
                result-=absolutes[i];
                continue;
            }
            result+=absolutes[i];
            
        }
        return result;
    }
}
