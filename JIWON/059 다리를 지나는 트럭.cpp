#include <string>
#include <vector>
#include <queue>

using namespace std;

int solution(int bridge_length, int weight, vector<int> truck_weights) {
    int answer = 0;
    queue<int> q;
    
    if(truck_weights.size() == 1){
        answer += bridge_length+1;
        
        return answer;
    }
    
    int bridge_weight = 0;
    int truckIdx = 0;
    
    while(true){
        answer++;
        
        if(q.size() == bridge_length){ // 다리가 다 찼으면
            bridge_weight -= q.front();
            q.pop();
        }
        
        if(bridge_weight + truck_weights[truckIdx] <= weight){ // 무게가 안넘으면
            bridge_weight += truck_weights[truckIdx];
            
            if(truckIdx == truck_weights.size() - 1) {
                answer += bridge_length;
                break;
            }
            
            q.push(truck_weights[truckIdx]);
            truckIdx++;
        } else{ // 무게가 넘으면
            q.push(0);
        }
    }
    
    return answer;
}
