package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.*;

public class Q11053 {
    static int[] arr; // 원 배열
    static int[] lis; // LIS 길이 저장
    static int[] V;   // 이전 인덱스 저장
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        arr = new int[]{10, 20, 40, 30, 1, 3, 5, 2, 90}; // 입력받은 배열
        lis = new int[arr.length]; // ils (결과값이 담긴 배열)<- 수열
        V = new int[arr.length]; // 부분 수열이 담길 배열 <- ex. -1(A)->3(B)->5(C) 등 
        
        // 가장 긴 lis값을 갖는 index를 반환함
        int result = dp(); // dp(Dynamic programming) 메소드 적용
        bw.write("LIS 길이 : " + String.valueOf(lis[result]) + "\n");
        // *********** 여기까지가 LIS 길이 구하는 부분. ***************
        
        
        // LIS 길이 값 출력하기
        bw.write("각 index의 LIS 값 : ");
        for(int i=0; i < lis.length; i++){
            bw.write(lis[i] + ", ");
        }
        bw.write("\n");
        
        // LIS 배열 출력해보기
        // 출력 시 뒤에서부터 lis 길이를 기준으로 써내려가야 한다.
        // 앞에서부터 하면 제일 앞의 값이 가장 큰 값일 때, 그것을 걸러낼 수 없다.
        bw.write("LIS 배열 출력하기" + "\n");
        printLis(result, bw);
        
        br.close();
        bw.flush();
    }
    
    // Bottom-Up 방식으로 해결하는 DP
    public static int dp(){
        // 최대 lis 길이 값
        int max_lis = 0; // 한마디로 말하자면 최대 길이의 결과값
        
        // 최대 길이를 만족시키는 부분 수열의 마지막 인덱스, 초기는 0으로
        int last = 0; // 최대 결과값의 마지막 항목
        
        // lis[0]은 정해졌으니 그 이후부터 채워나감
        for(int i=0; i < lis.length; i++){ // lis의 길이만큼 반복할 예정 <- lis는 수열이 담긴 결과값을 의미한다.
            lis[i] = 1; // 기본적으로 1로 초기화. 기저 상태도 초기화됨 <- lis의 모든 항목에 1로 초기화해준다.
            V[i] = -1; // 기본적으로 -1로 초기화. 기저 상태로 초기화됨 <- 부분 수열값이 담길 곳 전부 -1로 초기화. 즉, 모든 항목이 첫번째에 올 항목으로 설정되는 것.
            
            // 자신보다 이전의 값들과 비교해야함. 그 중 가장 큰 값으로!
            // 1. i=0은 패스
            // 2. i=1일 때, for문은 한 번 돌아간다. <- index 0,1번째 값을 비교하고 1번째 값이 0번째 보다 작고 lis길이가 같거나 크면 lis에 1을 더하고 부분 수열에 인덱스를 저장한다.
            for(int j=i-1; j >= 0; j--){ 
                System.out.println("이게 뭔지 모르겠음 : "+i+" / "+j);
                // 이전 값이 더 작으면서 lis 길이 값은 같거나 큰 경우
                if(arr[j] < arr[i] && lis[j] >= lis[i]){
                    lis[i] = lis[j] + 1;
                    V[i] = j; // 이전의 index 저장
                }
                if(max_lis < lis[i]){
                    max_lis = lis[i];
                    last = i; // 최대 길이가 변경되어야 한다.
                }
            }
        }
        return last;
    }
    
    // 재귀를 통해 LIS 배열 출력
    private static void printLis(int idx, BufferedWriter bw) throws IOException{
        // 더 갈 수 없는 가장 이전 index 까지 간 경우
        if(V[idx] == -1) { 
            bw.write(arr[idx] + " "); 
            return;
        }
        printLis(V[idx], bw);
        bw.write(arr[idx] + " ");
    }
}

/*
결과
LIS 길이 : 4
각 index의 LIS 값
1, 2, 3, 3, 1, 2, 3, 2, 4,
LIS 배열 출력하기
1, 3, 5, 90,
*/