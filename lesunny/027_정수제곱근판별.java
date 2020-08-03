import java.lang.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        double temp = Math.sqrt(n);
        
        if(temp - (int)temp > 0)
            answer = -1;
        else
            answer = (long)Math.pow(temp+1,2);
        
        return answer;
    }
}
