#include <iostream>
#include <queue>

using namespace std;

int n, m, k;
int arr[101][101][101] = {0, };
int visited[101][101][101] = {0, };

int dx[6] = {1, -1, 0, 0, 0, 0};
int dy[6] = {0, 0, 1, -1, 0, 0};
int dz[6] = {0, 0, 0, 0, 1, -1};

struct tomato{
    int x, y, z;
};

queue<tomato> q;

void bfs(){
    while(!q.empty()){
        int xx = q.front().x;
        int yy = q.front().y;
        int zz = q.front().z;

        q.pop();

        for(int i=0;i<6;i++){
            int nx = xx + dx[i];
            int ny = yy + dy[i];
            int nz = zz + dz[i];

            if(nx >= n || ny >= m || nz >= k || nx < 0 || ny < 0 || nz < 0) continue;

            if(arr[nz][ny][nx] == 0 && visited[nz][ny][nx] == -1){
                arr[nz][ny][nx] = 1;
                visited[nz][ny][nx] = visited[zz][yy][xx] + 1; 
                // tomato temp = {nx, ny, nz};
                // q.push(temp);
                q.push({nx, ny, nz});
            }
        }
    }
}

int main(){
    scanf("%d %d %d", &n, &m, &k);

    // [z][y][x]
    for(int i=0;i<k;i++){ // z
        for(int j=0;j<m;j++){ // y
            for(int l=0;l<n;l++){ // x
                scanf("%d", &arr[i][j][l]);
            }
        }
    }

    for(int i=0;i<k;i++){ // z
        for(int j=0;j<m;j++){ // y
            for(int l=0;l<n;l++){ // x
                visited[i][j][l] = -1;

                if(arr[i][j][l] == 1){
                    // printf("%d %d %d\n\n", j, l, i);
                    // tomato temp = {l, j, i};
                    // q.push(temp);
                    q.push({l, j, i});
                    visited[i][j][l] = 0;
                }
            }
        }
    }

    
    bfs();

    int result = 0;

    for(int i=0;i<k;i++){ // z
        for(int j=0;j<m;j++){ // y
            for(int l=0;l<n;l++){ // x
                result = max(result, visited[i][j][l]);
                if (arr[i][j][l] == 0 && visited[i][j][l] == -1) {
                    printf("-1\n");
                    return 0;
                }
            } 
        }
    }


    // for(int i=0;i<k;i++){ // z
    //     for(int j=0;j<m;j++){ // y
    //         for(int l=0;l<n;l++){ // x
    //             printf("%d ", visited[i][j][l]);
    //         }
    //         printf("\n");
    //     }
    // }

    

    printf("%d", result);


    

    return 0;
}
