#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int main() {

    int N;
    vector<int> an;
    int avg = 0;
    int mid = 0;
    int range = 0;

    scanf("%d", &N);

    for(int i=0;i<N;i++){
        int input;
        scanf("%d", &input);

        an.push_back(input);
    }
    

    for(int i=0;i<an.size();i++){
        avg += an[i];
    }

    // printf("\n");

    avg = floor((double)avg/N + 0.5);

    sort(an.begin(), an.end());

    mid = an[N/2];
    range = an[N-1] - an[0];

    int many = 0;

    vector<pair<int, int> > v;
    int count = 1;

    for(int i=0;i<an.size()-1;i++){
        if(an[i] == an[i+1]){
            count++;
        }else{
            v.push_back(make_pair(count, an[i]));
            count = 1;
        }
    }

    if(count>1) {
        v.push_back(make_pair(count, an[an.size()-1]));
    } else if(count == 1){
        v.push_back(make_pair(count, an[an.size()-1]));
    }

    sort(v.rbegin(), v.rend());
    
    if(v.size() == 1){
        many = v[0].second;
    }else{
        if(v[0].first == v[1].first){
            for(int i=v.size()-1;i>=0;i--){
                if(v[i].first == v[0].first){
                    many = v[i-1].second;
                    break;
                }
            }
        } else{
            many = v[0].second;
        }
    }
    
    printf("%d\n%d\n%d\n%d\n", avg, mid, many, range);


    return 0;
}
