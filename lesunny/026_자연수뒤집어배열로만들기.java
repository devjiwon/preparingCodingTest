import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        ArrayList<Long> list_answer = new ArrayList<>();

        while(n!=0){
            list_answer.add(n%10);
            n /= 10;
        }
        
        int[] answer = new int[list_answer.size()];
        for(int i=0; i<list_answer.size();i++){
            answer[i] = list_answer.get(i).intValue();
        }
        
        return answer;
    }
}
