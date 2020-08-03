#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    // vector<bool> primeN(n+1);
    bool primeN[10000000] = { false };
    
    for(int i=2;i<=n;i++){
        if(primeN[i] == false){
            answer++;
        }
        
        for(int j=i;j<=n;j+=i){
            primeN[j] = true;
        }
    }
    
    return answer;
}
