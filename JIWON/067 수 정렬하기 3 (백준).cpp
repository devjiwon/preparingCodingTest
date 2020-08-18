#include <iostream>

using namespace std;

int main() {

    int N;
    int an[10001] = { 0, };

    scanf("%d", &N);
    
    for(int i=0;i<N;i++){
        int input;

        scanf("%d", &input);

        an[input]++;
    }

    for(int i=0;i<10001;i++){
        if(an[i] == 0) continue;
        else{
            for(int k=0;k<an[i];k++){
                printf("%d\n", i);
            }
        }
    }

    return 0;
}
