#include <string>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

int solution(string s) {
    int answer = 0;
    int count = 1;
    vector<int> an;
    string re;
    int k = 0;
    
    if(s.size() == 1) return 1;
    
    for(int i=1;i<=s.size()/2;i++){
        for(int j=0;j<=s.size() - i;j += i){
            if(s.substr(j, i) == s.substr(i+j, i)){
                 count++;
            } else{
                if(count == 1){
                    re += s.substr(j, i);
                } else{
                    if(s.substr(j, i) == s.substr(i+j, i)){
                        count++;
                    } else{
                        re += to_string(count);
                        re += s.substr(j, i);
                        count = 1;
                    }
                }
            } // else
            k = i+j;
        }// for
        
        re += s.substr(k, s.size() - k);
        
        an.push_back(re.size());
        re = "";
        count = 1;
    }
    
    sort(an.begin(), an.end());
    
    return an[0];
}
