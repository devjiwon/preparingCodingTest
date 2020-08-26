#include <iostream>
#include <vector>

using namespace std;

int main(){

    int n;
    scanf("%d", &n);

    for(long i=1;i<10000000;i++){
        long sum = 0;
        long k = i;
        sum += k;
        while(k != 0){
            sum += k % 10;
            k /= 10;
        }
        
        if(sum == n){
            printf("%d\n", i);
            return 0;
        }
    }

    printf("0");

    return 0;
}
