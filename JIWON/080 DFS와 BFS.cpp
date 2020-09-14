#include <cstdio>
#include <vector>
#include <stack>
#include <queue>
#include <algorithm>
#include <functional>

using namespace std;
vector<vector<int> > adj;
vector<bool> visited;
int n, m, v;
int a, b;
void bfs(int v) {
    queue<int> q;
    q.push(v);
    
    while (!q.empty()) {
        int front = q.front();
        q.pop();
        if (visited[front] == true) continue;
        
        visited[front] = true;
        printf("%d ", front);


        sort(adj[front].begin(), adj[front].end());
        for (int i = 0; i < adj[front].size(); i++) {
            q.push(adj[front][i]);
        }
    }
    printf("\n");
}
void dfs(int v) {
    stack<int> s;
    s.push(v);
    
    while (!s.empty()) {
        int top = s.top();
        s.pop();
        if (visited[top]) continue;
        
        visited[top] = true;
        printf("%d ", top);
        
        sort(adj[top].rbegin(), adj[top].rend());
        
        for (int i = 0; i < adj[top].size(); i++) {
            if (visited[adj[top][i]] == false) s.push(adj[top][i]);
        }
    }
    printf("\n");
}

int main(void) {
    scanf("%d %d %d", &n, &m, &v);
    adj.resize(n + 1);
    visited.resize(n + 1);
    
    for (int i = 0; i < m; i++) {
        scanf("%d %d", &a, &b);
        adj[a].push_back(b);
        adj[b].push_back(a);
    }
    
    dfs(v);
    
    fill_n(visited.begin(), n + 1, false);
    bfs(v);
    
    return 0;
}
