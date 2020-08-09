#include <string>
#include <vector>

using namespace std;

int solution(string dartResult) {
    int answer = 0;
    vector<int> v;
    int s = 0;
    
    for(int i=0;i<dartResult.size();i++){
        if(dartResult[i] >= '0' && dartResult[i] <= '9'){
            s = dartResult[i] - '0';
            if(dartResult[i] == '1' && dartResult[i+1] == '0'){
                s = 10;
                i++;
            }
        }
        
        if(dartResult[i] == 'S') v.push_back(s), s = 0;
        else if(dartResult[i] == 'D') v.push_back(s*s), s = 0;
        else if(dartResult[i] == 'T') v.push_back(s*s*s), s = 0;
        else if(dartResult[i] == '*'){
            if(v.size() > 1) {
                v.back() *= 2;
                v[v.size() - 2] *= 2;
            }
            else v.back() *= 2;
        }
        else if(dartResult[i] == '#'){
            v.back() = -v.back();
        }
    }
    
    for(int i=0;i<v.size();i++){
        answer += v[i];
    }
    
    return answer;
}
