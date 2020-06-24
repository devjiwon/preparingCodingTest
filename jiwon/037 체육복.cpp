#include <string>
#include <vector>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {
    int answer = n - lost.size();
    
    for(int i=0;i<reserve.size();i++){
        for(int j=0;j<lost.size();j++){
            if(reserve[i] == lost[j]){
                // reserve[i] = 80;
                // lost[j] = 90;
                lost.erase(lost.begin()+(j--));
                reserve.erase(reserve.begin()+(i--));
                answer++;
                break;
            }
        }
    }
    
    for(int i=0;i<reserve.size();i++){
        for(int j=0;j<lost.size();j++){
            if(reserve[i] == lost[j] - 1 || reserve[i] == lost[j] + 1){
                answer++;
                // reserve[i] = 100;
                // lost[j] = 50;
                lost.erase(lost.begin()+(j--));
                reserve.erase(reserve.begin()+(i--));
                break;
            }
        }
    }
    
    
    return answer;
}
