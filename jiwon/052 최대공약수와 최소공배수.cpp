#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(int n, int m) {
    vector<int> answer;
    int num = m;
    
    for(int i=n; i>=1; i--){
        if(n % i == 0 && m % i == 0){
            answer.push_back(i);
            break;
        }
    }
    
    while(true){
        if(num % n == 0){
            answer.push_back(num);
            break;
        }
        num += m;
    }
    
    return answer;
}
