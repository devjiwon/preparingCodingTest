#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> board, vector<int> moves) {
    int answer = 0;
    vector<int> result;
    
    for(int i=0;i<moves.size();i++){
        for(int j=0;j<board.size();j++){
            if(board[j][moves[i]-1] != 0){
                result.push_back(board[j][moves[i]-1]);
                
                board[j][moves[i]-1] = 0;
                break;
            }
        }
    }
    
    for(int k = 1;k<result.size();k++){
        if(result[k] == result[k-1]){
            answer = answer + 2;
            result.erase(result.begin() + --k);
            result.erase(result.begin() + k++);
            
            k = 0;
        }
    }
    
    return answer;
}
