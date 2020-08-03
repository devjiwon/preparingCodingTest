#include <string>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;
    vector<vector<int>> save1;
    vector<vector<int>> save2;
    
    for(int i=0; i<arr1.size(); i++){
        vector<int> element;
        for(int j=0; j<n; j++){
            element.push_back(arr1.at(i)%2);
            arr1.at(i)/=2;
        }
        reverse(element.begin(), element.end());
        save1.push_back(element);
    }
    
    for(int i=0; i<arr2.size(); i++){
        vector<int> element;
        for(int j=0; j<n; j++){
            element.push_back(arr2.at(i)%2);
            arr2.at(i)/=2;
        }
        reverse(element.begin(), element.end());
        save2.push_back(element);
    }
    
    for(int i=0; i<save1.size() ; i++){
        string str = "";
        vector<int> tmp1 = save1.at(i);
        vector<int> tmp2 = save2.at(i);
        
        for(int j=0; j<n; j++){
            if(tmp1.at(j)==1||tmp2.at(j)==1)
            {
                 str+="#";
            }else{
                 str+=" ";
            }
        }
        answer.push_back(str);
    }
    
    return answer;
}
