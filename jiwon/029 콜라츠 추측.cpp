#include <string>
#include <vector>

using namespace std;

int solution(int num_1) {
    int answer = 0;
    long num = num_1;
    
    while(num != 1){
        answer++;
        
        if(answer > 500){
            answer = -1;
            break;
        }
        
        if(num % 2 == 0){
            num = num / 2;
        } else{
            num = 3*num + 1;
        }
    }
    
    return answer;
}
