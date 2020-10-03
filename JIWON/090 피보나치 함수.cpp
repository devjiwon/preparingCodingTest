#include <iostream>
#include <vector>

using namespace std;

int zeroArr[10001] = {0, };
int oneArr[10001] = {0, };

int main(){
    int n;
    scanf("%d", &n);

    zeroArr[0] = 1;
    zeroArr[1] = 0;
    oneArr[0] = 0;
    oneArr[1] = 1;

    for(int i=0;i<n;i++){
        int a;
        scanf("%d", &a);

        for(int j=2;j<=a;j++){
            zeroArr[j] = zeroArr[j-1] + zeroArr[j-2];
            oneArr[j] = oneArr[j-1] + oneArr[j-2];
        }

        printf("%d %d\n", zeroArr[a], oneArr[a]);
    }
    

    return 0;
}
