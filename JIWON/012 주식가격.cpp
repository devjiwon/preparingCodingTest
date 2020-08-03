#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> prices) {
    vector<int> answer;
    int count = 0;
    
    for(int i=0; i<prices.size(); i++){
        for(int j=i+1;j<prices.size();j++){
            if(prices[i] <= prices[j]){
                count++;
            } else{
                count++;
                break;
            }
        }
        
        answer.push_back(count);
        
        count = 0;
    }
    
    return answer;
}


//////////2020.07.31//////////

#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> prices) {
    vector<int> answer;
    int count = 0;
    
    for(int i=0;i<prices.size();i++){
        for(int j=i+1;j<prices.size();j++){
            count++;
            if(prices[i] > prices[j]) break;
        }
        answer.push_back(count);
        count = 0;
    }
    
    return answer;
}
