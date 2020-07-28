class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        double dx = x;

        while(x!= 0){
            sum += (x%10);
            x /= 10;
        }
        
        double result = dx%sum;
        
        if(result != 0) answer = false;
        
        return answer;
    }
}
