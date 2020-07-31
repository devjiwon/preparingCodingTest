class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int length = arr.length;
        
        if(length == 1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[length-1];
            
            int min = 100;
            for(int i=0; i<length; i++){
                min = Math.min(min, arr[i]);
            }
            int idx=0;
            for(int i=0; i<length; i++){
                if(min != arr[i])
                    answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}
