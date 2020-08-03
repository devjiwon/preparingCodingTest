#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;
    string anan = "";
    vector<int> a1;
    vector<int> a2;
    
    for(int k=0;k<n;k++){
        for(int i=0;i<n;i++){
            if(arr1[k] % 2 == 1){
                a1.push_back(1);
            } else{
                a1.push_back(0);
            }
            arr1[k] /= 2;
        }
 
        reverse(a1.begin(), a1.end());
        
        for(int i=0;i<n;i++){
            if(arr2[k] % 2 == 1){
                a2.push_back(1);
            } else{
                a2.push_back(0);
            }
            arr2[k] /= 2;
        }
        
        reverse(a2.begin(), a2.end());
        
        for(int i=0;i<n;i++){
            if(a1[i] == 1 || a2[i] == 1){
                anan += '#';
            } else{
                anan += ' ';
            }
        }
        
        answer.push_back(anan);
        
        anan = "";
        a1.clear();
        a2.clear();
    }
        
    return answer;
}
