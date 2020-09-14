#include <iostream>
#include <string.h>
using namespace std;
 
int dy[4]={1, -1, 0, 0};
int dx[4]={0, 0, 1, -1};
int m, n, k;
int arr[50][50]={0, };
int visited[50][50]={0, };
 
void dfs(int y,int x){
    
    for(int i=0; i<4; i++){
        int ny=y+dy[i];
        int nx=x+dx[i];
        
        if(ny<0 || ny>=n || nx<0 || nx>=m)
            continue;
        
        if(arr[ny][nx] && !visited[ny][nx]){
            visited[ny][nx]++;

            dfs(ny,nx);
        }
    }
}
int main(){
    int num,a,b;
    scanf("%d", &num);
    
    for(int l=0; l<num; l++){
        scanf("%d %d %d", &m, &n, &k);

        memset(arr,0,sizeof(arr));
        memset(visited,0,sizeof(visited));
        
        int count = 0;
        
        for(int i=0; i<k; i++){
            scanf("%d %d",&a,&b);
            arr[b][a] = 1;
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                if(arr[i][j] && !visited[i][j]){ // 배추가 심어져있고, 방문하지 않았다면
                    count++;
                    visited[i][j]++;
                    dfs(i, j);
                }
        }
        
        printf("%d\n", count);
    }
    return 0;
}
