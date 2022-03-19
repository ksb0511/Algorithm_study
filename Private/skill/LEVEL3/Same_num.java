package Private.skill.LEVEL3;

public class Same_num {

    //34.1 why....?
    public int solution(String s)
    {
        int answer, MAX = 0;
        char[] c = s.toCharArray();
        
        if(c.length==1)
            return 1;
        
        for(int i=1;i<c.length-1;i++){
            System.out.println(c[i]);
            answer=1;
            int x = i-1;
            int y = i+1;
            while(x>=0&&y<=c.length-1&&c[x]==c[y]){
                answer+=2;
                x--;
                y++;
            }
            
            
            if(answer==c.length){
                MAX = answer;
                break;
            }
            MAX = Math.max(answer, MAX); 
        }

        return MAX;
    }

}
