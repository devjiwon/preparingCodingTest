class Solution {
    public int compare(int idx, int length, int[] prices){
        int cnt=0;
        for(int i=idx+1;i<length;i++){
            cnt++;
            if(prices[idx]>prices[i]) break;
        }
        return cnt;
    }
    public int[] solution(int[] prices) {
        int[] answer = {};
        int length = prices.length;
        answer = new int[length];
        for(int i=0;i<length;i++){
            answer[i] = compare(i, length, prices);
        }
        
        return answer;
    }
}
