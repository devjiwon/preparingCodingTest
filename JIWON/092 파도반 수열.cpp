#include <iostream>

using namespace std;

int main(){
    long long f[101] = {0, };

    f[1] = f[2] = f[3] = 1;
    
    for(int i=4;i<=101;i++){
        f[i] = f[i-2] + f[i-3];
    }

    int num;
    scanf("%d", &num);

    for(int i=0;i<num;i++){
        int a;
        scanf("%d", &a);
        printf("%lld\n", f[a]);
    }

    return 0;
}
