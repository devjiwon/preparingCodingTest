class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int tmpX = x;

        while(tmpX != 0){
            sum += (tmpX%10);
            tmpX /= 10;
        }
        
        int result = x%sum;
        
        if(result != 0)
            answer = false;
        
        return answer;
    }
}
