import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[][] zerone = new int[41][2];
		zerone[0][0] = 1;
		zerone[1][1] = 1;
		
		for(int i=2; i<41; i++) {
			for(int j=0; j<2; j++) {
				zerone[i][j] = zerone[i-1][j] + zerone[i-2][j];
			}
		}
		
		for(int i=0; i<n; i++) {
			int number = Integer.parseInt(br.readLine());			
			sb.append(zerone[number][0]+" "+zerone[number][1]+"\n");
		}
		
		bw.write(new String(sb));
		bw.flush();
	}
}
