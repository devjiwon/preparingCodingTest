#include <iostream>
#include <algorithm>
#include <vector>
#include <stdio.h>

using namespace std;
 
int main() {
    int n, min = -1;
    int city[11][11];
    
    scanf("%d", &n);
 
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf("%d", &city[i][j]);
        }
    }
 
    vector<int> v(n);

    for (int i = 0; i < n; i++){
        v[i] = i;
    }
 
    do {
        int sum = 0;
        int ok = true;
        
        for (int i = 0; i < v.size() - 1; i++) {
            if (city[v[i]][v[i + 1]] != 0) {
                sum += city[v[i]][v[i + 1]];
            } else {
                ok = false;
                break;
            }
        }

        if (city[v[v.size() - 1]][v[0]] != 0 && ok == true) {
            sum += city[v[v.size() - 1]][v[0]];
            if (min < 0 || min > sum) min = sum;
        }

    } while (next_permutation(v.begin()+1, v.end()));
 
    printf("%d\n", min);
 
    return 0;
}
