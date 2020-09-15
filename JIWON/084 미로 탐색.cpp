#include <iostream>
#include <vector>
#include <queue>

using namespace std;

int n, m;
int arr[101][101] = {0, };
int visited[101][101] = {0, };
int dx[4] = {1, -1, 0, 0};
int dy[4] = {0, 0, 1, -1};

void bfs(int x, int y){
    queue<pair<int, int> > q;
    q.push(make_pair(x,y));

     while(!q.empty()){
        x = q.front().first;
        y = q.front().second;
        q.pop();

        for(int i=0;i<4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(0<=nx && nx<n && 0<= ny && ny<m){
                if(visited[nx][ny]==0 && arr[nx][ny]==1){
                    q.push(make_pair(nx,ny));
                    visited[nx][ny] = visited[x][y] + 1;
                }
                else if(visited[nx][ny]==0)
                    visited[nx][ny] = -1;
            }
        }
     }
}

int main(){
    scanf("%d %d", &n, &m);

    for(int i=0;i<n;i++){
        string s;
        cin >> s;

        for(int j=m-1;j>=0;j--){
            arr[i][j] = s[j] - '0';
        }
    }
    
    bfs(0, 0);

    printf("%d\n", visited[n-1][m-1]+1);


    return 0;
}
