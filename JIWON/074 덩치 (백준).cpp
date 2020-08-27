#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(){

    int n;
    scanf("%d", &n);
    vector<pair<int, int> > v;

    for(int i=0;i<n;i++){
        int a, b;
        scanf("%d %d", &a, &b);

        v.push_back(make_pair(a, b));
    }

    
    vector<int> answer;
    
    for(int i=0;i<n;i++){
        int rating = 1;
        for(int j=0;j<n;j++){
            if(v[i].first < v[j].first && v[i].second < v[j].second){
                rating++;
            }
        }
        answer.push_back(rating);
    }
    
    for(int i=0;i<n;i++){
        printf("%d ", answer[i]);
    }

   return 0;
}
