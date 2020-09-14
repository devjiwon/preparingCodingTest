#include <iostream>
#include <vector>
#include <stack>
#include <algorithm>

using namespace std;

vector<vector<int> > adj;
vector<bool> visited;

int answer = 0;

void dfs(int v){
    stack<int> s;
    s.push(v);

    while(!s.empty()){
        int top = s.top();
        s.pop();

        if(visited[top] == true) continue;

        visited[top] = true;
        answer++;

        sort(adj[top].rbegin(), adj[top].rend());

        for(int i=0;i<adj[top].size(); i++){
            if (visited[adj[top][i]] == false) s.push(adj[top][i]);
        }
    }

}

int main(){
    int n, m;
    int a, b;
    scanf("%d %d", &n, &m);

    adj.resize(n+1);
    visited.resize(n+1);

    for(int i=0;i<m;i++){
        scanf("%d %d", &a, &b);

        adj[a].push_back(b);
        adj[b].push_back(a);
    }

    sort(adj[1].rbegin(), adj[1].rend());

    dfs(1);

    printf("%d\n", answer-1);

    return 0;
}
