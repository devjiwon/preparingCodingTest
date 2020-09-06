import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> answer = new ArrayList<String>();
		
		while(true) {
			String ps = br.readLine();
			if(ps.equals(".")){
				break;
			}

			boolean flag = true;
			Stack<String> stack = new Stack<String>();
			
			for(int j=0; j<ps.length(); j++) {
				if(ps.substring(j,j+1).equals("(")) {
					stack.push("(");
				}else if(ps.substring(j,j+1).equals(")")){
					if(stack.isEmpty() || !stack.peek().equals("(")) {
						flag = false;
						break;
					}
					stack.pop();
				}else if(ps.substring(j,j+1).equals("[")) {
					stack.push("[");
				}else if(ps.substring(j,j+1).equals("]")){
					if(stack.isEmpty() || !stack.peek().equals("[")) {
						flag = false;
						break;
					}
					stack.pop();
				}
			}
			if(stack.isEmpty() && flag) {
				answer.add("yes");
			}else {
				answer.add("no");
			}
		}
		
		for(String ans : answer) {
			System.out.println(ans);
		}
	}	
}
