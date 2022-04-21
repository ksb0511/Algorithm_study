package Private.skill.LEVEL1;

public class two_num {
    public long solution(int a, int b) {
        long min, max;
        
        if(a==b) return a;
        
        if(a>b){
            min=b;
            max=a;
        }else{
            min=a;
            max=b;
        }
        
        long sum = (max+min)*(Math.abs(min-max)+1)/2;;
        
        return sum;
    }
}
