import java.util.ArrayList;

class Solution {
    public int checkNpop(ArrayList<Integer> basket){        
        for(int i=0; i<basket.size(); i++){
            if(i!=basket.size()-1 && basket.get(i)==basket.get(i+1)){
                basket.remove(i);
                basket.remove(i);
                return 2;
            }else if(i==basket.size()-1){
                return 0;
            }
        }
        return 0;
    }
    
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> basket = new ArrayList<>();
        
        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]-1] !=0){
                    basket.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    answer += checkNpop(basket);
                    break;
                }
            }
            
        }
        
        return answer;
    }
}
