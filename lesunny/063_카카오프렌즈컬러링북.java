import java.util.*;

class Solution {
    public int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[2];
        boolean[][] visited = new boolean[m][n];
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(picture[i][j] > 0 && !visited[i][j]) {
                    answer[0]++;
                    answer[1] = Math.max(answer[1], dfs(m, n, picture, i, j, picture[i][j], visited));
                }
            }
        }
        
        return answer;
    }
    
    int dfs(int m, int n, int[][] picture, int x, int y, int num, boolean[][] visited) {
        Stack<int[]> stack = new Stack<>();
        int cnt = 0;
        stack.push(new int[] {x,y});
        visited[x][y] = true;
        
        while(!stack.isEmpty()) {
            int nx = stack.peek()[0];
            int ny = stack.peek()[1];
            stack.pop();
            cnt++;
            
            if(0 <= nx-1 && picture[nx-1][ny] == num && !visited[nx-1][ny]) {
                stack.push(new int[] {nx-1,ny});
                visited[nx-1][ny] = true;
            }
            if(nx+1 < m && picture[nx+1][ny] == num && !visited[nx+1][ny]) {
                stack.push(new int[] {nx+1,ny});
                visited[nx+1][ny] = true;
            }
            if(0 <= ny-1 && picture[nx][ny-1] == num && !visited[nx][ny-1]) {
                stack.push(new int[] {nx,ny-1});
                visited[nx][ny-1] = true;
            }
            if(ny+1 < n && picture[nx][ny+1] == num && !visited[nx][ny+1]) {
                stack.push(new int[] {nx,ny+1});
                visited[nx][ny+1] = true;
            }
        }
        
        return cnt;
    }
}
