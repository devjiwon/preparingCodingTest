#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<string> solution(vector<string> strings, int n) {
    vector<string> answer;
    vector<pair<string, string>> aa;
    string ss;
    
    sort(strings.begin(), strings.end());
    
    for(int i=0;i<strings.size();i++){
        ss = strings[i].at(n);
        
        aa.push_back(pair<string, string>(ss, strings[i]));
    }
    
    sort(aa.begin(), aa.end());
    
    for(int i=0;i<strings.size();i++){
        answer.push_back(aa[i].second);
    }
    
    return answer;
}
