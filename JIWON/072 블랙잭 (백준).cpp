#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(){

    int n, m;
    scanf("%d %d", &n, &m);
    vector<int> v;

    for(int i = 0;i<n;i++){
        int a;
        scanf("%d", &a);
        v.push_back(a);
    }

    sort(v.begin(), v.end());

    int sum = 0;
    vector<int> vv;

    for(int i=0;i<v.size()-2;i++){
        for(int j=i+1;j<v.size()-1;j++){
            for(int k=j+1;k<v.size();k++){
                sum = v[i] + v[j] + v[k];

                if(sum > m) break;
    
                vv.push_back(sum);
                sum = 0;
            }
        }
    }

    sort(vv.rbegin(), vv.rend());

    printf("%d", vv[0]);

    return 0;
}
