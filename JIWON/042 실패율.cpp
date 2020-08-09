#include <string>
#include <vector>
// #include <pair>
#include <algorithm>

using namespace std;

bool compare(pair<double, double> a, pair<double, double> b)
{   
    if(a.first != b.first) return a.first > b.first;
    else return a.second < b.second;
}

vector<int> solution(int N, vector<int> stages) {
    vector<int> answer;
    vector<pair<double, double>> an_temp;

    double sum = 0;
    double NN = stages.size();
    
    for(int i=1;i<=N;i++){
        for(int j=0;j<stages.size();j++){
            if(stages[j] == i){
                sum++;
            }
        }
        
        // printf("%f   %f\n", sum, NN);
        if(NN == 0) NN = 1;
        
        an_temp.push_back(pair<double, double>(sum/NN, i));
        
        NN = NN - sum;
        sum = 0;
    }
    
    sort(an_temp.begin(), an_temp.end(), compare);
    
    for(int i=0;i<N;i++){
        printf("%f   %f\n", an_temp[i].first, an_temp[i].second);
        
        answer.push_back(an_temp[i].second);
    }
    
    return answer;
}
