import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	static long[] ans = new long[91];
	public static long fib(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if(ans[n]!=0)
			return ans[n];
		return ans[n]=fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		bw.write(Long.toString(fib(n)));
		
		bw.flush();
	}
}
