package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
길이가 N인 임의의 배열 d : N-6개 만큼 0, 6개 만큼 1
d 배열의 다음 순열을 계속 구하며 d[i]가 1일 때 a[i]를 temp 배열에 추가
temp 배열이 완성되면 temp 배열들을 answer 배열에 넣는다
*/
public class Main{
	public static void swap(List<Integer> arr, int i, int j) {
		int temp = arr.get(i);
		arr.set(i,arr.get(j));
		arr.set(j,temp);
	}
	public static boolean nextPermutation(List<Integer> arr) {
		int max=-1;
		int number = arr.size();
		for(int i=1; i<number; i++) {
			if(arr.get(i-1)<arr.get(i)) max = i;			
		}
		
		if(max==-1)
			return false;
		
		int max2=-1;
		for(int j=max; j<number;j++) {ㅅ
			if(arr.get(max-1)<arr.get(j))
				max2=j;
		}
		
		swap(arr, max-1, max2);
				
		max2=arr.size()-1;
		while(max<max2) {
			swap(arr,max,max2);
			max++;
			max2--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int n = in.nextInt();
			if(n==0) break;
			
			int[] lotto = new int[n];
			
			for(int i=0; i<n; i++) {
				lotto[i] = in.nextInt();
			}
			
			//permutation array
			List<Integer> d = new ArrayList<>();
			
			for(int i=0;i<n-6;i++) {
				d.add(0);
			}
			for(int i=0;i<6;i++) {
				d.add(1);
			}
			
			//answer array
			List<List<Integer>> answer = new ArrayList<>();
			do {
				List<Integer> temp = new ArrayList<>();
				for(int i=0;i<n;i++) {
					if(d.get(i)==1) {
						temp.add(lotto[i]);
					}
				}
				answer.add(temp);
			}while(nextPermutation(d));
			
			//compareTo() in lambda expression
			answer.sort((x,y) -> {
				int r=0;
				for(int i=0;i<answer.size();i++) {
					r=x.get(i)-y.get(i);
					if(r!=0)
						break;
				}
				return r;
			});
			
			for(List<Integer> a:answer) {
				for(int i=0; i<a.size();i++) {
					System.out.print(a.get(i)+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
