import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list_answer = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0)
                list_answer.add(arr[i]);    
        }
        if(list_answer.isEmpty())
            list_answer.add(-1);
        
        int[] answer = new int[list_answer.size()];
        int idx = 0;
        Collections.sort(list_answer);
        
        for(int element : list_answer){
            answer[idx++] = element;
        }
        
        return answer;
    }
}
