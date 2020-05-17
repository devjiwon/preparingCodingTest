#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    int count = 0;
    
    for(int i=0;i<s.size();i++){
        if(s[i] == ' ') {
            count = 1;
        }
        
        if(count % 2 == 0){
            answer += toupper(s[i]);    
        } else{
            answer += tolower(s[i]);
        }
        count++;
    }
    
    return answer;
}
