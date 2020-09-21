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
	static int[][] maze;
	static int cnt;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	
	public static void bfs() {
		Queue<Node> queue = new LinkedList<>();
		cnt=1;
		visited[0][0] = cnt;
		
		queue.offer(new Node(0,0));
		while(!queue.isEmpty()) {
			Node r = queue.poll();
			int x = r.x;
			int y = r.y;
			for(int i=0; i<4; i++) {
				if(x+dx[i]<0 || x+dx[i]>=n || y+dy[i]<0 ||y+dy[i]>=m)
					continue;
				else if(maze[x+dx[i]][y+dy[i]]==1 && visited[x+dx[i]][y+dy[i]]==0) {
					visited[x+dx[i]][y+dy[i]]=visited[x][y]+1;
					queue.offer(new Node(x+dx[i],y+dy[i]));
				}
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String cond = br.readLine();
		n = Integer.parseInt(cond.split("\\s")[0]);
		m = Integer.parseInt(cond.split("\\s")[1]);
		maze = new int[n][m];
		visited = new int[n][m];
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<m; j++) {
				maze[i][j] = Integer.parseInt(str.substring(j,j+1));
			}
		}
		
		bfs();
		
		bw.write(Integer.toString(visited[n-1][m-1])+"\n");
		bw.flush();
		
	}
}
