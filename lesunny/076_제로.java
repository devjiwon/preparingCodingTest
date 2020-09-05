import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0)
				stack.pop();
			else
				stack.push(num);
		}

		int sum = 0;

		if(stack.isEmpty())
			System.out.println(sum);
		else {
			for(int element : stack) {
				sum+=element;
			}
			System.out.println(sum);
		}
	}	
}
