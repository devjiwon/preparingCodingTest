#include <string>
#include <vector>
using namespace std;

int solution(string skill, vector<string> skill_trees) {
    int answer = 0;
    int ranking[27] = {0,};
    for(int i=0;i<skill.length();i++){
        ranking[skill[i]-'A']=i+1;
    }
    for(int i=0;i<skill_trees.size();i++){
        string now = skill_trees[i];
        bool pass = true;
        int pos = 1;
        for(int j=0;j<now.length();j++){
            if (ranking[now[j]-'A']==0) continue;
            if (ranking[now[j]-'A']==pos){
                pos++;
            } else pass = false;
        }
        
        if (pass) answer++;
    }
    return answer;
}
