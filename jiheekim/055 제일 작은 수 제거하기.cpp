#include <string>
#include <vector>
#include<algorithm>

using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer;
     if(arr.size()==1){
        arr[0]=-1;
         
    return arr;}
    
 else{
            int min=*min_element(arr.begin(), arr.end());
            arr.erase(remove(arr.begin(),arr.end(),min), arr.end());
         for(int i=0;i<arr.size();i++){
             answer.push_back(arr[i]);
         }
      
    return answer;}
}
