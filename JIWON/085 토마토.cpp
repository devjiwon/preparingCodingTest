#include <iostream>
#include <queue>

using namespace std;

int arr[1001][1001] = {0, };
int visited[1001][1001] = {0, };
int dx[4] = {1, -1, 0, 0};
int dy[4] = {0, 0, 1, -1};
queue<pair<int, int> > q;
int n, m;

void bfs(){
    while(!q.empty()){
        int x = q.front().first;
        int y = q.front().second;

        q.pop();

        for(int i=0;i<4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= m || ny >= n) continue;

            if (arr[nx][ny] == 0 && visited[nx][ny] == -1) {
                arr[nx][ny]++;
                visited[nx][ny] = visited[x][y] + 1; 
                q.push(make_pair(nx, ny));
            }
        }
    }
}

int main(){
    scanf("%d %d", &n, &m);

    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            scanf("%d", &arr[i][j]);
            visited[i][j] = -1;
            if(arr[i][j] == 1){
                q.push(make_pair(i ,j));
                visited[i][j] = 0;
            }
        }
    }

    bfs();

    int result = 0; 
    for (int i = 0; i < m; i++) { 
        for (int j = 0; j < n; j++) {
            result = max(result, visited[i][j]);
            if (arr[i][j] == 0 && visited[i][j] == -1) { 
                printf("-1");
                return 0;
            }
        } 
    }
                
    printf("%d", result);

    return 0;
}
