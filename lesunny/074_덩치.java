import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[][] people = new int[N][2];
		int[] answer = new int[N];
		
		for(int i=0; i<N; i++) {
			people[i][0] = in.nextInt();
			people[i][1] = in.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			int tmp = 0;
			for(int j=0; j<N; j++) {
				if(i!=j && people[i][0]<people[j][0] && people[i][1]<people[j][1]) {
					tmp++;
				}
			}
			answer[i] = tmp+1;
		}
		
		for(int i=0; i<N; i++) {
			System.out.print(answer[i]);
			if(i!=N-1)
				System.out.print(" ");
			else
				System.out.println();
		}
	}
}
