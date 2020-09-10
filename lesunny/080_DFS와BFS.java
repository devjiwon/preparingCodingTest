import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.Scanner;
import java.util.Queue;

class Main{
	static ArrayList<Integer>[] adjacent;
	static int N;
	static boolean[] marked;
	
	private static void dfs(int pos){
		if(marked[pos])
			return;
		marked[pos] = true;
		System.out.print(pos+" ");
		for(int node : adjacent[pos]) {
			if(!marked[node])
				dfs(node);
		}
	}
	
	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		marked[start] = true;
		
		while(!queue.isEmpty()) {
			int first = queue.poll();
			System.out.print(first+" ");
			for(int node : adjacent[first]) {
				if(!marked[node]) {
					marked[node] = true;
					queue.add(node);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		int M = in.nextInt();
		int V = in.nextInt();
		
		//initialize list
		adjacent = new ArrayList[N+1];
		for(int i=1; i<=N; i++) {
			adjacent[i] = new ArrayList<Integer>();
		}
		
		//add Edge
		for(int i=0; i<M; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			adjacent[a].add(b);
			adjacent[b].add(a);
		}
		for(int i=1; i<=N; i++) {
			Collections.sort(adjacent[i]);
		}
		
		marked = new boolean[N+1];
		dfs(V);
		System.out.println();
		
		marked = new boolean[N+1];
		bfs(V);
		System.out.println();
		
		in.close();
	}
}
