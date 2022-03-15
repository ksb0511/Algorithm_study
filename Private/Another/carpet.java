package Private.Another;

public class carpet {
    public int[] solution(int brown, int yellow) {
        int x=1;

        while(x+(yellow/x)!=(brown-4)/2||yellow%x!=0)
            x++;

        if(x<yellow/x)
            x = yellow/x;

        int[] answer = {x+2, yellow/x+2};

        return answer;
    }
}
