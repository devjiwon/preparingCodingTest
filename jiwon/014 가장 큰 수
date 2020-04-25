#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool comp(string &a, string &b){
    if(a+b > b+a){
        return true;
    }
    return false;
}

string solution(vector<int> numbers) {
    string answer = "";
    vector<string> temp;
    
    for(int i=0;i<numbers.size();i++){
        temp.push_back(to_string(numbers[i]));
    }
    
    sort(temp.begin(), temp.end(), comp);
    
    for(int i=0;i<numbers.size();i++){
        answer += temp[i];
    }
    
    if(answer.front() == '0') answer = '0';
    
    return answer;
}
