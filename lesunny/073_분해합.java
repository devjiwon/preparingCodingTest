import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int decomposition = in.nextInt();
		int size = String.valueOf(decomposition).length();
	
		for(int i=decomposition-(9*size); i<decomposition; i++) { //constructor i
			int tmpDecomposition = i;
			int tmp = i;
			while(tmp>0) {
				tmpDecomposition += tmp%10;
				tmp/=10;
			}	
			
			if(tmpDecomposition == decomposition) {
				System.out.println(i);
				return;
			}
			else if(i==decomposition-1){
				System.out.println(0);
			return;
			}
		}		
	}
}
