import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

class Main{
	final static int[] dx= {0,0,1,-1};
	final static int[] dy= {1,-1,0,0};
	static int num;
	static int cnt=0;
	static ArrayList<Integer> answer;
	
	public static void dfs(int[][] village, int i, int j) {
		cnt++;
		village[i][j]=0;
		for(int k=0; k<4; k++) {
			if(i+dy[k]<0 || i+dy[k]>=num || j+dx[k]<0 || j+dx[k]>=num)
				continue;
			else {
				int y=i+dy[k]; int x=j+dx[k];
				if(village[y][x]==1) {
					dfs(village, y, x);
				}
			}					
		}		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		num = Integer.parseInt(br.readLine());
		answer = new ArrayList<Integer>();
		int[][] village = new int[num][num];
		
		for(int i=0; i<num; i++) {
			String str = br.readLine();
			for(int j=0; j<num; j++) {
				village[i][j]=Integer.parseInt(str.substring(j,j+1));
			}
		}
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(village[i][j]==1) {
					cnt = 0;
					dfs(village,i,j);
					answer.add(cnt);
				}
			}
		}
		
		bw.write(Integer.toString(answer.size()));
		bw.newLine();
		Collections.sort(answer);
		for(int cnt : answer) {
			bw.write(Integer.toString(cnt));
			bw.newLine();			
		}
		bw.flush();
	}
}
