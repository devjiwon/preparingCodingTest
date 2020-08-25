import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		int[] arr = new int[8001];
		for(int i=0; i<N; i++) {
			int tmp = Integer.parseInt(br.readLine());
			list.add(tmp);
			arr[tmp+4000]++;
		}
		Collections.sort(list);
		
		//중앙값
		int median = list.get(N/2);
		
		//산술평균
		int sum4avg = 0;
		for(int data : list) {
			sum4avg += data;
		}
		
		int avg = (int) Math.round((double)sum4avg/N);
		
		//범위
		int range = list.get(list.size()-1)-list.get(0);
		
		//최빈값
		int mode = 0;
		int cnt = 0;
		for(int i=0; i<8001; i++) {
			if(arr[i]>cnt) {
				cnt=arr[i];
			}
		}
		
		int maxCnt = 0;
		for(int i=0; i<8001; i++) {
			if(arr[i]==cnt && maxCnt==0 ) {
				mode=i;
				maxCnt++;
			}else if(arr[i]==cnt && maxCnt==1) {
				mode=i;
				break;
			}
		}
		mode-=4000;
		
		sb.append(avg).append("\n");
		sb.append(median).append("\n");
		sb.append(mode).append("\n");
		sb.append(range).append("\n");
		
		System.out.println(sb);
	}
}
