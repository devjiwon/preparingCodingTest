import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Main{
	static ArrayList<Integer>[] adjacent;
	static boolean[] marked;

	public static int bfs() {
		Queue<Integer> queue = new LinkedList<>();
		int cnt = 0;
		queue.add(1);
		marked[1] = true;
		
		while(!queue.isEmpty()) {
			int pos = queue.poll();
			cnt++;
			//System.out.println(cnt+" : "+pos);
			for(int element : adjacent[pos]) {
				if(!marked[element]) {
					marked[element]=true;
					queue.add(element);
				}
				
			}
		}
		
		return cnt-1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int edges = Integer.parseInt(br.readLine());
		adjacent = new ArrayList[num+1];
		for(int i=1; i<=num; i++) {
			adjacent[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<edges; i++) {
			String[] e = br.readLine().split("\\s");
			
			adjacent[Integer.parseInt(e[0])].add(Integer.parseInt(e[1]));
			adjacent[Integer.parseInt(e[1])].add(Integer.parseInt(e[0]));
		}
		
		marked = new boolean[num+1];
		System.out.println(bfs());
		
	}
}
