import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int paper_num = citations.length;
        
        for(int i=0; i<=paper_num; i++){ // h
            int num = 0;
            for(int j=0; j<paper_num ; j++){
                if(citations[j]>=i)
                    num++;
            }
            if(num>=i)
                answer = i;
        }
        
        return answer;
    }
}
