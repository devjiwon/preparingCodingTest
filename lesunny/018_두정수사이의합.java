class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max=0, min=0;
        if(a>=b){
            max=a;
            min=b;
        }else{
            max=b;
            min=a;
        }
        for(; min<=max;min++){
            answer+=min;
        }
        
        return answer;
    }
}
