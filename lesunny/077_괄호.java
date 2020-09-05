import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<String> answer = new ArrayList<String>();
		
		for(int i=0; i<N; i++) {
			String ps = br.readLine();
			boolean flag = true;
			Stack<String> stack = new Stack<String>();
			
			for(int j=0; j<ps.length(); j++) {
				if(ps.substring(j,j+1).equals("(")) {
					stack.push("(");
				}else{
					if(stack.isEmpty()) {
						flag = false;
						break;
					}
					stack.pop();
				}
			}
			if(stack.isEmpty() && flag) {
				answer.add("YES");
			}else {
				answer.add("NO");
			}
		}
		
		for(String ans : answer) {
			System.out.println(ans);
		}
	}	
}
