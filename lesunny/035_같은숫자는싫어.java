import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list_answer = new ArrayList<>();
        int prev = arr[0];
        list_answer.add(arr[0]);
        
        for(int i=1; i<arr.length;i++){
            if(prev == arr[i])
                continue;
            else{
                list_answer.add(arr[i]);
            }
            prev = arr[i];
        }
        
        int answer[] = new int[list_answer.size()];
        int idx = 0;
        for(int element : list_answer){
            answer[idx++] = element;
        }
        
        return answer;
    }
}
