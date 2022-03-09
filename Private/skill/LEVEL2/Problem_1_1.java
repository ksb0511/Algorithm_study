package Programmers.Skill_Check.LEVEL2;

public class Problem_1_1 {
    public int[] solution(int[] money) {
        
        int[] a = new int[money.length];
        
        int x=0;
        for(int i=0;i<money.length;i++){
            x= money[i];
            for(int j=i+1;j<money.length;j++){
                if(x>money[j]){
                    a[i]=j-i;
                    break;
                }
                else if(j==money.length-1) a[i]=j-i;
            }
        }
        
        return a;
    }
}
