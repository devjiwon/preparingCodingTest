#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {

    int N;
    vector<int> an;

    scanf("%d", &N);
    
    for(int i=0;i<N;i++){
        int input;
        scanf("%d", &input);
        an.push_back(input);
    }

    sort(an.begin(), an.end());

    for(int i=0;i<an.size();i++){
        printf("%d\n", an[i]);
    }

    
    return 0;
}
