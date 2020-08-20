import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException {
		//InputStreamREader는 InputStream 객체를 입력으로 가져야 한다.(System.in) - 문자로 읽기
		//BufferedReader는 InputStreamReader의 객체를 입력값으로 사용 - 통째로 읽기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(int value : list) {
			sb.append(value).append("\n");
		}
		System.out.println(sb);
	}
}
