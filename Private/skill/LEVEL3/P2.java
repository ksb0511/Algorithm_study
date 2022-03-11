package Private.skill.LEVEL3;

import java.util.ArrayList;

public class P2 {
    public int solution(int n, int[][] computers) {

        int count = n;
        ArrayList a = new ArrayList();

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(j!=i&&computers[i][j]==1){
                    if(a.contains(Integer.toString(i))&&a.contains(Integer.toString(j))){

                    }else if(!a.contains(Integer.toString(i))&&!a.contains(Integer.toString(j))){
                        a.clear();
                        a.add(Integer.toString(i));
                        a.add(Integer.toString(j));
                        count--;
                    }else{
                        a.add(Integer.toString(i));
                        a.add(Integer.toString(j));
                        count--;
                    }

                }
            }
        }
        return count;
    }
}
