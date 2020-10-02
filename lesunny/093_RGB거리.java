import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] homes = new int[N+1][3];
        int[][] homes_cost = new int[N+1][3];
        
        for(int i=1; i<=N; i++){
            String[] str = br.readLine().split("\\s");
        	homes[i][0] = Integer.parseInt(str[0]);
        	homes[i][1] = Integer.parseInt(str[1]);
        	homes[i][2] = Integer.parseInt(str[2]);
        }
        
        for(int i=1; i<=N; i++){
        	homes_cost[i][0] = Math.min(homes_cost[i-1][1],homes_cost[i-1][2])+homes[i][0];
        	homes_cost[i][1] = Math.min(homes_cost[i-1][0],homes_cost[i-1][2])+homes[i][1];
        	homes_cost[i][2] = Math.min(homes_cost[i-1][0],homes_cost[i-1][1])+homes[i][2];
        }
        
        int result = Math.min(Math.min(homes_cost[N][0], homes_cost[N][1]),homes_cost[N][2]);
        
        bw.write(result+"\n");
        bw.flush();
    }
}
