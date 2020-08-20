import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	private static void bubbleSort(int[] arr, int last) {
		if(last > 0) {
			for(int i=0; i<last; i++) {
				if(arr[i] > arr[i+1]) {
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
			bubbleSort(arr, last-1);
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		bubbleSort(arr,arr.length-1);
		
		for(int data : arr) {
			sb.append(data).append("\n");
		}
		
		System.out.println(sb);
	}
}
