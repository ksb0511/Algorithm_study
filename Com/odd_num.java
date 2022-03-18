package Com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class odd_num {
	public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int sum;
        for(int i=0;i<n;i++){
            sum=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<10;j++){
                int num = Integer.parseInt(st.nextToken());
                if(num%2==1)
                    sum+=num;
            }
            sb.append("#").append(i+1).append(" "+sum+"\n");

        }

        System.out.println(sb);
    }

}

