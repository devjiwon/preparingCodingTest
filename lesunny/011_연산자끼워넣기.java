package programmers;

import java.util.Scanner;

public class Main{
	static int max = -987654321;
	static int min = 987654321;
	static int[] nums;
	static int[] ops;
	static int n;
	
	//각 순열에 대한 연산 후 max, min 값
	public static void calculate() {
		int result = nums[0];
		
		for(int i=0; i<n-1;i++) {
			if(ops[i]==1) result+=nums[i+1];
			else if(ops[i]==2) result-=nums[i+1];
			else if(ops[i]==3) result*=nums[i+1];
			else result/=nums[i+1];
		}
		min = Math.min(min, result);
		max = Math.max(max, result);
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void nextPermutation(int arr[]) {
		int max1=-1;
		int number = arr.length;
		for(int i=1; i<number; i++) {
			if(arr[i-1]<arr[i]) max1 = i;			
		}
		
		if(max1==-1)
			return;

		int max2=-1;
		for(int j=max1; j<number;j++) {
			if(arr[max1-1]<arr[j])
				max2=j;
		}
		
		swap(arr, max1-1, max2);
				
		max2=number-1;
		while(max1<max2) {
			swap(arr,max1,max2);
			max1++;
			max2--;
		}
		
		calculate();
	}
	public static int factorial(int n) {
		if(n==1) return 1;
		else return n*factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = in.nextInt();
		}
		ops = new int[n-1];
		int idx=0;
		for(int i=0;i<4; i++) {
			int temp = in.nextInt();
			
			//1:+, 2:-, 3:*, 4:/
			for(int j=0; j<temp; j++) {
				if (i==0) ops[idx++] = 1;
				else if(i==1) ops[idx++] = 2;
				else if(i==2) ops[idx++] = 3;
				else ops[idx++] = 4;
			}
		}
		
		calculate();

		if(n-1 > 1) {
			for(int j=0;j<factorial(n-1);j++)
			{
				nextPermutation(ops);
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}
}
