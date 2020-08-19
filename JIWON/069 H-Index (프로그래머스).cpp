#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> citations) {
    
    sort(citations.begin(), citations.end());
    
    if(citations.at(citations.size()-1) == 0) return 0;
    
    int h = citations.size();
    while(true){
        int a = 0;
        int b = 0;
        
        for(int i = citations.size()-1;i>=0;i--){
            if(citations[i] >= h){
                a++;
            }
            if(citations[i] <= h){
                b++;
            }
        }
        if(h <= a && h >= b){
            return h;
        }
        
        h--;
    }
}
