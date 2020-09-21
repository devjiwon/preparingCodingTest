/*
  2차원 토마토
  백준 7576번
*/
import java.util.*;
import java.io.*;

class Node{
	int x;
	int y;
	Node(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class Main {
	static int n;
	static int m;
	static int[][] visited;
	static int[][] tomatoes;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static Queue<Node> queue = new LinkedList<>();
	
	public static int bfs() {
		while(!queue.isEmpty()) {
			Node r = queue.poll();
			int x = r.x;
			int y = r.y;
			for(int i=0; i<4; i++) {
				if(x+dx[i]<0 || x+dx[i]>=n || y+dy[i]<0 ||y+dy[i]>=m)
					continue;
				else if(tomatoes[x+dx[i]][y+dy[i]]==0 && visited[x+dx[i]][y+dy[i]]==0) {
					visited[x+dx[i]][y+dy[i]]=visited[x][y]+1;
					tomatoes[x+dx[i]][y+dy[i]]=1;
					queue.offer(new Node(x+dx[i],y+dy[i]));
				}
			}
		}
		
		int answer = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				answer = Math.max(answer, visited[i][j]);
				if(visited[i][j]==0 && tomatoes[i][j]==0) {
					return -1;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String cond = br.readLine();
		m = Integer.parseInt(cond.split("\\s")[0]);
		n = Integer.parseInt(cond.split("\\s")[1]);
		tomatoes = new int[n][m];
		visited = new int[n][m];
		for(int i=0; i<n; i++) {//세로
			String[] str = br.readLine().split("\\s");
			for(int j=0; j<m; j++) {//가로
				tomatoes[i][j] = Integer.parseInt(str[j]);
				if(tomatoes[i][j]==1)
					queue.offer(new Node(i,j));
			}
		}
		
		bw.write(Integer.toString(bfs())+"\n");
		bw.flush();
		
	}
}
