class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int idx = 0;
        answer[idx++] = x;
        
        while(idx<n){
            answer[idx] = answer[idx-1]+x;
            idx++;
        }
        return answer;
    }
}
