import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Main{

	public static int calculate(int n) {
		int result = 0;
		
		if (n==1) result=1;
		else if (n==2) result=2;
		else if (n==3) result=4;
		else {
			result = calculate(n-1) + calculate(n-2) + calculate(n-3);
		}
		
		return result;
	}
    public static void main(String[] args){
    	
    	Scanner in = new Scanner(System.in);
    	int testcase = in.nextInt();
    	
    	ArrayList<Integer> result = new ArrayList<>();
    	
    	for(int i=0; i<testcase; i++) {
    		result.add(calculate(in.nextInt()));
    	}
    	
    	for(int i=0; i<testcase; i++) {
    		System.out.println(result.get(i));
    	}
       
    }
}
