#include <string>
#include <vector>

using namespace std;

int solution(string arrangement) {
    int answer = 0;
    
    int count = 0;
    
    for(int i=0;i<arrangement.length();i++){
        if(arrangement[i] == '('){
            count++;
        }
        else if(arrangement[i] == ')'){
            if(arrangement[i-1] == ')'){
                answer += 1;
                count--;
            }
            else{
                count--;
                answer += count;
            }
        }
    }
    
    return answer;
}
