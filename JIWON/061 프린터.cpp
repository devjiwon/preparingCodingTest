#include <string>
#include <vector>

using namespace std;

int solution(vector<int> priorities, int location) {
    int answer = 0;
    int max = 0;
    
    for(int i=0;i<priorities.size();i++){
        if(max <= priorities[i]) max = priorities[i];
    }
    
    int i = 0;
    while(true){
        if(i == priorities.size()) i = 0;
        
        if(max == priorities[i]){
            answer++;
            max = 0;
            
            if(location == i){
                return answer;
            }
            priorities[i] = -1;
            
            for(int j=0;j<priorities.size();j++){
                if(max <= priorities[j]) max = priorities[j];
            }
        }
        i++;
    }
    
    return answer;
}
