import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int start = commands[i][0];
            int ends = commands[i][1];
            int order = commands[i][2];
            
            //깊은 복사 : copyOfRange(배열, 시작인덱스, 끝인덱스+1)
            int[] copy = Arrays.copyOfRange(array, start-1, ends);
            
            //배열 정렬
            Arrays.sort(copy);
            
            //숫자 정답 배열에 더하기
            answer[i] = copy[order-1];
        }
        
        return answer;
    }
}
