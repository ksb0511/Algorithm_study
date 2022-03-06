package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.IOException;

public class Q9012 {
	public static int n;
	public static String[] result;
	static String A;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		result = new String[n];

		for(int i=0;i<n;i++){
			A=br.readLine();
			Stack<Integer> s= new Stack<>();
			
			char ch[] = A.toCharArray();

			for(int j=0;j<ch.length;j++){
				if(ch[j]==')'&&s.size()==0){
					sb.append("NO\n");
					s.push(0);
					break;
				}
				if(ch[j]==')'){
					s.pop();
				}
				else 
					s.push(1);
			}
			if(s.size()==0)
				sb.append("YES\n");
			else if(s.peek()!=0) sb.append("NO\n");
		}

		System.out.println(sb);
		
	}

}