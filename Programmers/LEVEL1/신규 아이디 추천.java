class Solution {
    public String solution(String new_id) {
        String answer = "";

        answer = new_id.toLowerCase();
        char[] c = answer.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char value : c) {
            if (value == '-' || value == '_' || value == '.' || (value>='0'&&value<='9')||(value>='a'&&value<='z')) {
                sb.append(value);
            }
        }

        
        answer = sb.toString();
        sb.setLength(0);
        int i=0;
        for (int j=0;j<answer.length();j++) {
            if(answer.charAt(j)=='.')
                i++;
            else
                i=0;
            if(i<2){
                sb.append(answer.charAt(j));
            }
        }
        
        answer = sb.toString();
        
        sb.setLength(0);
        if(answer.length()>0){
            
            while(answer.length()>0 && answer.charAt(0)=='.'){
                answer = answer.substring(1);
            }
        }

        if(answer.isEmpty())
            answer = "a";
        
        if(answer.length()>15)
            answer = answer.substring(0,15);

        while(answer.charAt(answer.length()-1)=='.'){
            answer = answer.substring(0, answer.length()-1);
        }

        while(answer.length()<3){
            answer += answer.charAt(answer.length()-1);
        }
        return answer;
    }
}


// 공부하려는 코드 (정규식)
class Solution {
    public String solution(String new_id) {
        String answer = "";
        String temp = new_id.toLowerCase();

        temp = temp.replaceAll("[^-_.a-z0-9]","");
        System.out.println(temp);
        temp = temp.replaceAll("[.]{2,}",".");
        temp = temp.replaceAll("^[.]|[.]$","");
        System.out.println(temp.length());
        if(temp.equals(""))
            temp+="a";
        if(temp.length() >=16){
            temp = temp.substring(0,15);
            temp=temp.replaceAll("^[.]|[.]$","");
        }
        if(temp.length()<=2)
            while(temp.length()<3)
                temp+=temp.charAt(temp.length()-1);

        answer=temp;
        return answer;
    }
}
