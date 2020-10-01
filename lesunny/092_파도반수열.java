import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	static long[] dp_arr = new long[101];
	public static long padovan(int n) {
		if(n==1 || n==2 || n==3)
			return 1;
		if(n==4 || n==5)
			return 2;
		if(dp_arr[n]!=0)
			return dp_arr[n];
		
		return dp_arr[n]=padovan(n-1)+padovan(n-5);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++)
		{
			int n = Integer.parseInt(br.readLine());
			
			sb.append(padovan(n)+"\n");
		}
		
		
		bw.write(new String(sb));
		bw.flush();
	}
}
