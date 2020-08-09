import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int length = progresses.length;
        int[] elapsedDay = new int[length];
        ArrayList<Integer> ansAL = new ArrayList<>();
        int[] answer;
        
        for(int i=0; i<length; i++){
            int num = (100-progresses[i])/speeds[i];
            if((double)(100-progresses[i])/speeds[i] > (double)num)
                elapsedDay[i] = (100-progresses[i])/speeds[i] + 1;
            else
                elapsedDay[i] = (100-progresses[i])/speeds[i];
        }
        
        for(int i=0; i<length; i++){
            int cnt = 1;
            
            for(int j=i+1; j<length ; j++){
                if(elapsedDay[i] < elapsedDay[j] ){ 
                    i=j-1;
                    break;
                }else{
                    cnt++;
                }
                
                if(j==length-1)
                    i=j;
            }                    
            
            ansAL.add(cnt);
        }
        
        answer = new int[ansAL.size()];
        int idx=0;
        for(int ans : ansAL){
            answer[idx++] = ans;
        }
                
        return answer;
    }
}