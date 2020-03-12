import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static int factorial(int n) {
		if(n==1) return 1;
		else return n*factorial(n-1);
	}
	public static void main(String[] args){
    	
    	Scanner in = new Scanner(System.in);
    	int number = in.nextInt();
    	int[] perm = new int[number];
    	
    	for(int i=0; i<number; i++) {
    		perm[i] = i+1;
    	}    	
    	
    	int testcase = factorial(number);
    	
    	for(int t=0; t<testcase; t++) {
    		for(int i=0; i<number;i++) {
            	if(i<number-1) System.out.print(perm[i]+" ");
            	else System.out.println(perm[i]);
            }
    		
    		int max = -1;
            for(int i=1; i< number; i++) {
            	if(perm[i-1] < perm[i]) max = i;
            }
            	
            if(max==-1) {
            	System.exit(0);
            }
            	
            int max2 = -1;
            for(int j=max ; j<number; j++) {
            	if(perm[max-1] < perm[j]) max2 = j;
            }
            	
            //swap i-1 <-> j
            int temp = perm[max-1];
            perm[max-1] = perm[max2];
            perm[max2] = temp;
            	
            ArrayList<Integer> tempArr = new ArrayList<>();
            for(int i=max ; i<number; i++) {
            	tempArr.add(perm[i]);
            }
            	
            Collections.reverse(tempArr);
            	
            for(int i=max; i<number; i++) {
            	perm[i] = tempArr.get(i-max);
            }
            	
            
    	}
        
    }
}
