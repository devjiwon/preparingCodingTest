#include <string>
#include <vector>

using namespace std;

bool solution(int x) {
    bool answer = true;
    int num = 0;
    int xx = x;
    
    while(x != 0){
        num += x % 10;
        x /= 10; 
    }
    
    if(xx % num == 0){
        answer = true;
    } else{
        answer = false;
    }
    
    return answer;
}
