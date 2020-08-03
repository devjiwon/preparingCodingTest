class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int element : arr){
            answer += element;
        }
        answer /= arr.length;
        
        return answer;
    }
}
