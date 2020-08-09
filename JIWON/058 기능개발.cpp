#include <string>
#include <vector>
#include <cmath>

using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
    vector<int> answer;
    vector<int> a;
    double temp_pro;
    
    for(int i=0;i<progresses.size();i++){
        temp_pro = ceil((double)(100 - progresses[i]) / (double)speeds[i]);
        answer.push_back(temp_pro);
    }
    
    for(int i=0;i<answer.size()-1;i++){
        for(int j=i+1;j<answer.size();j++){
            if(answer[i] > answer[j]){
                answer[j] = answer[i];
            }
        }
    }
    
    int count = 1;
    
    for(int i=0;i<answer.size();i++){
        if(answer[i] == answer[i+1]){
            count++;
        } else{
            a.push_back(count);
            
            count = 1;
        }
    }
    
    return a;
}
