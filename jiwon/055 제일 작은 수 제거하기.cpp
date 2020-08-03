#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    int min = 100000;
    int idx = 0;
    
    for(int i=0;i<arr.size();i++){
        if(arr.size() == 1 || arr.size() == 0) {
            answer.push_back(-1);
            return answer;
        }
        
        if(min > arr[i]) {
            min = arr[i];
            idx = i;
        }
    }
    
    arr.erase(arr.begin() + idx);
    
    return arr;
}
