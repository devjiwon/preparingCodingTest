#include <string>
#include <vector>

using namespace std;

vector<int> solution(int brown, int yellow) {
    vector<int> answer;
    int sum = brown + yellow;
    int h = 3;
    
    while(true){
        int w = sum / h;
        if((w - 2) * (h - 2) == yellow){
            if(w >= 3 && h >= 3){
                answer.push_back(w);
                answer.push_back(h);
                break;
            }
        }
        h++;
    }
    
    return answer;
}
