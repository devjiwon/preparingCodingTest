#include <iostream>
#include <stdio.h>
using namespace std;

int main(){
    
    int s, e, m;
    int S = 1, E = 1, M = 1;

    int i=1;

    scanf("%d %d %d", &s, &e, &m);

    while(true){

        if(S == 16) S = 1;
        if(E == 29) E = 1;
        if(M == 20) M = 1;

        if(S == s && E == e && M == m) {
            printf("%d", i);

            break;
        }

        S++;
        E++;
        M++;

        i++;
    }

    

    return 0;
}
