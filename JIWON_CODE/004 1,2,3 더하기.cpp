#include<iostream>
#include <stdio.h>
 
using namespace std;
 
int dp[1000] = { 0 };
 
int solve(int n)
{
    if (n < 0) return 0;
    if (n <= 1) return 1;
    if (dp[n]) return dp[n];

    return dp[n] = solve(n - 3) + solve(n - 2) + solve(n - 1);
}
 
int main()
{
    int T;
    scanf("%d", &T);
    for(;T--;)
    {
        int n;
        scanf("%d", &n);

        printf("%d\n", solve(n));
    }
}
