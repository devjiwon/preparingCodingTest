/*
  3차원 배열 토마토
  백준 7569번
*/
import java.util.*;
import java.io.*;

class Node{
	int x;
	int y;
	int z;
	Node(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
public class Main {
	static int n;
	static int m;
	static int o;
	static int[][][] visited;
	static int[][][] tomatoes;
	static int[] dx = {0, 0, 1,-1, 0, 0};
	static int[] dy = {0, 0, 0, 0, 1,-1};
	static int[] dz = {1,-1, 0, 0, 0, 0};
	static Queue<Node> queue = new LinkedList<>();
	
	public static int bfs() {
		while(!queue.isEmpty()) {
			Node r = queue.poll();
			int x = r.x;
			int y = r.y;
			int z = r.z;
			for(int i=0; i<6; i++) {
				if(x+dx[i]<0 || x+dx[i]>=n || y+dy[i]<0 ||y+dy[i]>=m || z+dz[i]<0 ||z+dz[i]>=o)
					continue;
				else if(tomatoes[x+dx[i]][y+dy[i]][z+dz[i]]==0 && visited[x+dx[i]][y+dy[i]][z+dz[i]]==0) {
					visited[x+dx[i]][y+dy[i]][z+dz[i]]=visited[x][y][z]+1;
					tomatoes[x+dx[i]][y+dy[i]][z+dz[i]]=1;
					queue.offer(new Node(x+dx[i],y+dy[i],z+dz[i]));
				}
			}
		}
		
		int answer = 0;
		for(int k=0; k<o; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					answer = Math.max(answer, visited[i][j][k]);
					if(tomatoes[i][j][k]==0) {
						return -1;
					}
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
		o = Integer.parseInt(cond.split("\\s")[2]);
		tomatoes = new int[n][m][o];
		visited = new int[n][m][o];
		
		for(int k=0; k<o; k++) {
			for(int i=0; i<n; i++) {//세로
				String[] str = br.readLine().split("\\s");
				for(int j=0; j<m; j++) {//가로
					tomatoes[i][j][k] = Integer.parseInt(str[j]);
					if(tomatoes[i][j][k]==1)
						queue.offer(new Node(i,j,k));
				}
			}
		}
		
		bw.write(Integer.toString(bfs())+"\n");
		bw.flush();
		
	}
}
