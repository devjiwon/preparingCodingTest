#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;
    string anan = "";
    vector<int> a1;
    vector<int> a2;
    
    for(int i=0;i<arr1.size();i++){
        while(true){
            if(arr1[i] == 0) break;
            
            if(arr1[i] % 2 == 1){
                a1.push_back(1);
            } else{
                a1.push_back(0);
            }
            arr1[i] /= 2;
        }
        
        while(true){
            if(a1.size() == n) break;
            
            a1.push_back(0);
        }
        
        reverse(a1.begin(), a1.end());
        
        /////////////
        
        while(true){
            if(arr2[i] == 0) break;
            
            if(arr2[i] % 2 == 1){
                a2.push_back(1);
            } else{
                a2.push_back(0);
            }
            arr2[i] /= 2;
        }
        
        while(true){
            if(a2.size() == n) break;
            
            a2.push_back(0);
        }
        
        reverse(a2.begin(), a2.end());
        
        
        for(int j=0;j<n;j++){
            if(a1[j] == 1 || a2[j] == 1){
                anan += '#';
            } else{
                anan += ' ';
            }
        }
        
        
        answer.push_back(anan);
        
        anan = "";
        a1.clear();
        a2.clear();
    } //for
    
    
    
    return answer;
}
