class Solution {
    public int solution(String s) {
        int answer = s.length();
        for(int i = 1; i <= s.length() / 2; i++){
            int zipLevel = 1;
            String zipStr = s.substring(0, i);
            StringBuilder result = new StringBuilder();
            
            for(int j = i; j <= s.length(); j += i){
                String next = s.substring(j, j + i > s.length() ? s.length() : i + j);
                if(zipStr.equals(next)) zipLevel++;
                else{
                    result.append((zipLevel != 1 ? zipLevel : "") + zipStr);
                    zipStr = next;
                    zipLevel = 1;
                }
            }
            result.append(zipStr);
            answer = Math.min(answer, result.length());
        }
        
        return answer;
    }
}


// 공부할 코드

2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
class Solution {
    public int solution(String s) {
        int answer = 0;

        for(int i=1; i<=(s.length()/2)+1; i++){
            int result = getSplitedLength(s, i, 1).length();
            answer = i==1 ? result : (answer>result?result:answer);
        }

        return answer;
    }

    public String getSplitedLength(String s, int n, int repeat){
        if(s.length() < n) return s;
        String result = "";
        String preString = s.substring(0, n);
        String postString = s.substring(n, s.length());

        // 불일치 -> 현재까지 [반복횟수 + 반복문자] 조합
        if(!postString.startsWith(preString)){
            if(repeat ==1) return result += preString + getSplitedLength(postString, n, 1);
            return result += Integer.toString(repeat) + preString + getSplitedLength(postString, n, 1);
        }

        return result += getSplitedLength(postString, n, repeat+1);
    }
}
