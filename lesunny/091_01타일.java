import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	static int[] dp_arr = new int[1000001];
	public static int zeronetile(int n) {
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		if(dp_arr[n]!=0)
			return dp_arr[n];
		
		return dp_arr[n]=(zeronetile(n-1)+zeronetile(n-2))%15746;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		sb.append(zeronetile(n));
		
		
		bw.write(new String(sb));
		bw.flush();
	}
}
