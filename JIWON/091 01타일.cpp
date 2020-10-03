#include <iostream>

using namespace std;

int main(){

    long n;
    scanf("%ld", &n);

    long long f[1000001] = {0, };

    f[1] = 1;
    f[2] = 2;
    if(n == 1) {
        printf("1");
        return 0;
    }
    if(n == 2){
        printf("2");
        return 0;
    }

    for(long i=3;i<=n;i++){
        f[i] = (f[i-1] + f[i-2])%15746;
    }

    printf("%lld", f[n]%15746);

    return 0;
}
