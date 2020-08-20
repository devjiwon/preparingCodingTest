import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException{
		//using BufferedReader + Couning Sort
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		/*
		 -1000000 ~ 1000000
		 기준점 0 = index 1000000 으로 가정
		 */
		//수가 중복되지 않아 boolean
		boolean[] arr = new boolean[2000001];
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[Integer.parseInt(br.readLine())+1000000] = true;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]) {
				sb.append(i-1000000).append('\n');
			}
		}
		System.out.println(sb);
	}
}
