#include <string>
#include <vector>

using namespace std;

int solution(string skill, vector<string> skill_trees) {
    int answer = 0;
    int rank[27] = {0, };
    
    for(int i=0;i<skill.size();i++){
        rank[skill[i] - 'A'] = i+1;
    }
    
    for(int i=0;i<skill_trees.size();i++){
        int pos = 1;
        bool pass = true;
        for(int j=0;j<skill_trees[i].size();j++){
            if(rank[skill_trees[i][j] -'A'] == 0) continue;
            
            if (rank[skill_trees[i][j] -'A'] == pos){
                pos++;
            } else {
                pass = false;
                break;
            }
        }
        if (pass) answer++;
    }
    
    return answer;
}
