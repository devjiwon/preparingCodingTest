import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	public static void dfs(int[][] field, int x, int y, int m, int n) {
		field[x][y]=0;
		for(int i=0; i<4; i++) {
			if(x+dx[i]<0 || x+dx[i]>=m || y+dy[i]<0 || y+dy[i]>=n )
				continue;
			else {
				if(field[x+dx[i]][y+dy[i]]==1)
					dfs(field,x+dx[i],y+dy[i],m,n);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		int[] answer = new int[t];
		
		for(int i=0; i<t; i++) {
			String[] cond = br.readLine().split("\\s");
			int m = Integer.parseInt(cond[0]);
			int n = Integer.parseInt(cond[1]);
			int cabbage = Integer.parseInt(cond[2]);
			int[][] field = new int[m][n];
			
			for(int j=0; j<cabbage; j++) {
				String[] pos = br.readLine().split("\\s");
				int x = Integer.parseInt(pos[0]);
				int y = Integer.parseInt(pos[1]);
				
				field[x][y] = 1;
			}
			
			int cnt = 0;
			for(int x=0; x<m; x++) {
				for(int y=0; y<n; y++) {
					if(field[x][y]==1) {
						cnt++;
						dfs(field, x,y, m, n);
					}
				}
			}
			answer[i] = cnt;
		}
		
		for(int cnt : answer) {
			bw.write(Integer.toString(cnt)+"\n");
		}
		bw.flush();
	}
}
