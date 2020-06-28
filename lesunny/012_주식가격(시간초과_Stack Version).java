import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0;i<prices.length;i++){
           
            int temp = 0;
            int val = prices[i];
             Stack<Integer> stack = new Stack<>();
            
            for(int j=prices.length-1; j > i; j--){
                stack.add(prices[j]);
            }
            int size = stack.size();
            
            for(int j=0; j< size; j++){
                temp++;
                if(val > stack.pop()){
                    break;
                }
            }
            
            answer[i] = temp;
            
        }
        
        return answer;
    }
}
