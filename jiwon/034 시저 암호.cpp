#include <string>
#include <vector>

using namespace std;

string solution(string s, int n) {
    string answer = "";
    
    unsigned int ss[10000];
    
    for(int i=0;i<s.size();i++){
        ss[i] = s[i];
    }
    
    for(int i=0;i<s.size();i++){
        if(ss[i]>=65 && ss[i] <= 90){
            ss[i] += n;
            if(ss[i] >= 91){
                ss[i] -= 26;
            }
        } else if(ss[i]>=97 && ss[i] <= 122){
            ss[i] += n;
            if(ss[i] >= 123){
                ss[i] -= 26;
            }
        }
    }
    
    for(int i=0;i<s.size();i++){
        answer += ss[i];
    }
    
    return answer;
}
