import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] NM = br.readLine().split("\\s");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		String[] strArr = br.readLine().split("\\s");
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		int max=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				for(int k=0; k<N; k++) {
					if(i!=j && i!=k && j!=k && arr[i]+arr[j]+arr[k]>max && arr[i]+arr[j]+arr[k]<=M){
						max = arr[i]+arr[j]+arr[k];
					}
				}
			}
		}
		System.out.println(max);
	}
}
