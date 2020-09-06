import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] seq = new int[N];

		ArrayList<String> answer = new ArrayList<>();
		int[] inputArr = new int[N];
		for(int i=0; i<N;i++){
		    seq[i] = Integer.parseInt(br.readLine());
		    inputArr[i] = i+1;
		}

		Stack<Integer> stack = new Stack<Integer>();

		int idx = 0;
		int inputIdx = 0;
		boolean flag = false;
		int full = 0;
		while(idx<seq.length){
		    if(!stack.isEmpty() && seq[idx]==stack.peek()){
			if(idx==seq.length-1){
			    flag=true;
			}
			stack.pop();
			//System.out.println("pop "+idx);

			idx++;
			answer.add("-");
		    }else{
			if(inputIdx!=N){
			    //System.out.println("push "+inputArr[inputIdx]);

			    stack.push(inputArr[inputIdx]);
			    inputIdx++;
			}
			else if(inputIdx==N){
			    if(full>0){
				break;
			    }
			    full++;   
			    continue;
			}
			answer.add("+");
		    }
		}

		if(flag){
		    for(String ans : answer){
			System.out.println(ans);
		    }
		}else{
		    System.out.println("NO");
		}
	}	
}
