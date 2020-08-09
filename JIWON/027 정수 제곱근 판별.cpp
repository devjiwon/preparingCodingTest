#include <string>
#include <vector>

using namespace std;

long long solution(long long n) {
    long long answer = 0;
    
    for(long long i=1;i<=n;i++){
        answer = -1;
        if(n == i*i){
            answer = (i+1)*(i+1);
            break;
        } 
    }
    
    return answer;
}
