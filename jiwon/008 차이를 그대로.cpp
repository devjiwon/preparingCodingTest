#include <iostream>
#include <vector>
#include <algorithm>
#include <stdio.h>
using namespace std;
 
int main()
{
    int n;
    vector<int> v;
    int sum = 0, max = 0;

    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        int temp;
        scanf("%d", &temp);
        v.push_back(temp);
    }

    sort(v.begin(), v.end());

    do{
        for(int i=0;i<v.size()-1;i++){
            if(v[i+1] >= v[i]){
                sum += v[i+1] - v[i];
            } else{
                sum += v[i] - v[i+1];
            }
        }

        if(max < sum) max = sum;

        sum = 0;

    } while(next_permutation(v.begin(), v.end()));
 
    printf("%d", max);
 
    return 0;
}
