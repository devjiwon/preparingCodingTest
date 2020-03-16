#include <iostream>
#include <stdio.h>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    
    int temp;
    vector<int> result;
    int sum = 0;
    int i,j;
    int count=0;

    for(int k=0;k<9;k++){
        scanf("%d", &temp);
        result.push_back(temp);
    }
    
    for(int k=0;k<9;k++){
        sum += result[k];
    }

    sort(result.begin(), result.end());

    for(i=0;i<9;i++){
        for(j=i+1;j<9;j++){
            if(sum - result[i] - result[j] == 100) {
                for(int k=0;k<9;k++){
                    if(k == i || k == j){
                        continue;
                    }

                    if(count == 7) break;

                    cout << result[k] <<endl;
                    // printf("%d", result[k]);

                    count++;
                    

                    // printf("\n");
                }
            }
        }
    }

    
    
    return 0;
}
