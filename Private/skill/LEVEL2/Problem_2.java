package Private.skill.LEVEL2;

//실패
public class Problem_2 {

    public int[] solution(String[] info, String[] query) {
        
        String result[][] = new String[query.length][5];
        int result_score[] = new int[query.length];
        
        for(int i=0;i<query.length;i++){
            String[] words = query[i].split(" and ");
            String[] score = words[3].split(" ");
            
            result[i][0] = words[0]=="-"?"":words[0];
            result[i][1] = words[1]=="-"?"":words[1];
            result[i][2] = words[2]=="-"?"":words[2];
            result[i][3] = score[0]=="-"?"":score[0];
            result[i][3] = score[1]=="-"?"":score[1];
            
            // result_score[i]= Integer.parseInt(score[1]);
            
            
        }
        int[] answer = new int[result.length];
        
        for(int i=0;i<info.length;i++){
            for(int j=0;j<result.length;j++){
                int intStr = Integer.parseInt(info[i].replaceAll("[^0-9]", ""));
                
                System.out.println(info[i].contains(result[j][0]));
                
                if(info[i].contains(result[j][0])&&info[i].contains(result[j][1])&&info[i].contains(result[j][2])&&info[i].contains(result[j][3])&&intStr>=Integer.parseInt(result[j][4])){
                    answer[j]++;
                    break;
                }
            }
        }
            
        for(int j=0;j<result.length;j++){
            System.out.print(result[j]+"\n");
        }
        
        return answer;
    }

}
