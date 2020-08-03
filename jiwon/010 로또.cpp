#include <iostream>
#include <algorithm>
#include <vector>
#include <stdio.h>
using namespace std;
 
int main(){
    
    int n;
    
    while(true){
        scanf("%d",&n);
        
        if(n==0)
            break;
        
        vector<int> arr(n,0);
        vector<int> vec(n,0);
        for(int i=0;i<n;i++)
            scanf("%d",&arr[i]);
        
        for(int i=6;i<n;i++)
            vec[i]=1;
        
        do{
            for(int i=0;i<n;i++)
                if(vec[i]==0)
                    printf("%d ",arr[i]);
            
            printf("\n");
        }while(next_permutation(vec.begin(),vec.end()));
        
        printf("\n");
        
    }
    
    return 0;
}
