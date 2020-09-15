#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int n;
int cc = 0;
long adj[26][26] = {0, };
long visited[26][26] = {0, };

int dx[4] = {1, -1, 0, 0};
int dy[4] = {0, 0, 1, -1};

void dfs(int x, int y){
    for(int i=0; i<4; i++){
        int nx = x + dx[i];
        int ny = y + dy[i];

        if(nx < 0 || ny < 0 || nx >= n || ny >= n){
            continue;
        }

        if(adj[nx][ny] == 1 && visited[nx][ny] == 0){
            visited[nx][ny] = 1;
            cc++;

            dfs(nx, ny);
        }
    }
}

int main(){
    scanf("%d", &n);

    for(int i=0;i<n;i++){
        string s;
        cin >> s;

        for(int j=n-1;j>=0;j--){
            adj[i][j] = s[j] - '0';
        }
    }
    
    int count = 0;
    vector<int> answer;

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(adj[i][j] == 1 && visited[i][j] == 0){
                count++;
                visited[i][j]++;
                cc++;
                dfs(i, j);
                answer.push_back(cc);
                cc = 0;
            }
        }
    }

    printf("%d\n", count);

    sort(answer.begin(), answer.end());

    for(int i=0;i<answer.size(); i++){
        printf("%d\n", answer[i]);
    }

    return 0;
}
