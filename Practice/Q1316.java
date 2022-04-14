package Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.io.IOException;
 
public class Q1316 {
	static int ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ans = n;
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			checkFunc(str);
		}
		System.out.println(ans);
	}
	private static void checkFunc(String str) {
		HashSet<Character> set = new HashSet<>();
		char ch = str.charAt(0);
		set.add(ch);
		for(int i=0;i<str.length();i++) {
			if(ch == str.charAt(i))
				continue;
			else {
				if(set.contains(str.charAt(i))) {
					ans--;
					return;
				}				
				else {
					ch = str.charAt(i);
					set.add(ch);
				}
			}				
		}
	}
}