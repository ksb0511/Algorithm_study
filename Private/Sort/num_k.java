package Programmers.Sort;

import java.util.*;

public class num_k {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] practice = {};
        int start;
        
        for(int i=0;i<commands.length;i++){
            start=-1;
            practice = new int[commands[i][1]-commands[i][0]+1];
            
            for(int j=commands[i][0]-1;j<commands[i][1];j++){
                practice[++start] = array[j];           
            }
                     
            Arrays.sort(practice);
            
            answer[i]=practice[commands[i][2]-1];
        }
        return answer;   
    }


    public int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
