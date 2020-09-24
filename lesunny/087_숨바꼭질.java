import java.util.*;
import java.io.*;

public class Main {
	static int[] visited = new int[100001];
	
	public static int bfs(int start, int end) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		visited[start]=1;
		while(!queue.isEmpty()) {
			int f = queue.poll();
			if(f==end)
				return visited[f]-1;
			
			if(f-1>=0 && visited[f-1]==0) {
				queue.offer(f-1);
				visited[f-1]=visited[f]+1;
			}
			if(f+1<=100000 && visited[f+1]==0) {
				queue.offer(f+1);
				visited[f+1]=visited[f]+1;
			}
			if(2*f<=100000 && visited[2*f]==0) {
				queue.offer(2*f);
				visited[2*f]=visited[f]+1;
			}
		}
		return 0;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] strArr = br.readLine().split("\\s");
		int pos1 = Integer.parseInt(strArr[0]);
		int pos2 = Integer.parseInt(strArr[1]);
		
		bw.write(Integer.toString(bfs(pos1,pos2))+"\n");
		bw.flush();
		
	}
}
