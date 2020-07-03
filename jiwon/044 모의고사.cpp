#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    
    int su1[] = {1,2,3,4,5};
    int su2[] = {2,1,2,3,2,4,2,5};
    int su3[] = {3,3,1,1,2,2,4,4,5,5};
    int count1 = 0, count2 = 0, count3 = 0;
    int cc = 0;
    int i1 = 0, i2 = 0, i3 = 0;
    
    while(true){
        if(cc == answers.size()) break;

        if(i1 == 5) i1 = 0;
        if(i2 == 8) i2 = 0;
        if(i3 == 10) i3 = 0;

        if(su1[i1] == answers[cc]) count1++;
        if(su2[i2] == answers[cc]) count2++;
        if(su3[i3] == answers[cc]) count3++;

        i1++, i2++, i3++, cc++;
    }
    
    int maxNum = max(max(count1, count2), count3);
    
    if(count1 == maxNum) answer.push_back(1);
    if(count2 == maxNum) answer.push_back(2);
    if(count3 == maxNum) answer.push_back(3);
    
    return answer;
}
